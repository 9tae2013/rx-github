package it.me.tae.mygithub;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jakewharton.rxbinding.widget.RxTextView;

import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import it.me.tae.mygithub.github.Github;
import it.me.tae.mygithub.github.GithubApi;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.exceptions.Exceptions;
import rx.observables.ConnectableObservable;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

import static android.R.attr.bitmap;
import static com.jakewharton.rxbinding.widget.RxTextView.textChanges;

public class MainActivity extends AppCompatActivity {
    public static final String GITHUB_BASE_URL = "https://api.github.com/";

    private View rootLayout;
    private TextView username;
    private ImageView image;
    private TextView name;
    private TextView url;
    private TextView followers;
    private TextView following;
    private ProgressBar progressBar;

    private Subscription subscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = findViewById(R.id.rootLayout);
        username = (TextView) findViewById(R.id.github_username);
        image = (ImageView) findViewById(R.id.github_image);
        name = (TextView) findViewById(R.id.github_name);
        url = (TextView) findViewById(R.id.github_url);
        followers = (TextView) findViewById(R.id.github_followers);
        following = (TextView) findViewById(R.id.github_following);
        progressBar = (ProgressBar) findViewById(R.id.loading_progress_bar);

        GithubApi api = createGithubApi();
        ConnectableObservable<Github> obs = RxTextView.textChanges((TextView) findViewById(R.id.github_username))
                .debounce(500, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(s -> clearView())
                .filter(s -> s.length() > 3)
                .doOnNext(s -> {
                    showSnackbarText("Searching ...");
                    progressBar.setVisibility(View.VISIBLE);
                })
                .flatMap(s -> api.getGithubUser(s.toString())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnError(t -> {
                            showSnackbarError(t.getMessage());
                            progressBar.setVisibility(View.INVISIBLE);
                        })
                        .onErrorResumeNext(Observable.empty())
                ).publish();

        showDetail(obs);
        loadImage(obs);

        subscription = obs.connect();
    }

    @Override
    protected void onStop() {
        if (subscription != null && subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
        super.onStop();
    }

    private GithubApi createGithubApi() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create(new ObjectMapper()))
                .client(client)
                .baseUrl(GITHUB_BASE_URL)
                .build();

        return retrofit.create(GithubApi.class);
    }

    private void showDetail(Observable<Github> obs) {
        obs.subscribe(
                        github -> {
                            name.setText(github.getName());
                            url.setText(github.getHtmlUrl());
                            followers.setText(String.valueOf(github.getFollowers()));
                            following.setText(String.valueOf(github.getFollowing()));
                        }
                );
    }

    private void loadImage(Observable<Github> obs) {
        obs.observeOn(Schedulers.io())
                .map(github -> {
                    try {
                        return BitmapFactory.decodeStream((InputStream) new URL(github.getAvatarUrl()).getContent());
                    } catch (Exception e) {
                        throw Exceptions.propagate(e);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(bitmap -> {
                    progressBar.setVisibility(View.INVISIBLE);
                    image.setImageBitmap(bitmap);
                });
    }

    private void clearView() {
        image.setImageResource(0);
        name.setText("");
        url.setText("");
        followers.setText("");
        following.setText("");
    }

    private void showSnackbarText(String msg) {
        Snackbar.make(rootLayout, msg, Snackbar.LENGTH_LONG).show();
    }

    private void showSnackbarError(String msg) {
        Snackbar snackbar = Snackbar.make(rootLayout, msg, Snackbar.LENGTH_LONG)
                .setActionTextColor(Color.YELLOW);

        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(Color.RED);
        snackbar.show();
    }

}
