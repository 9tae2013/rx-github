package it.me.tae.mygithub;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

import it.me.tae.mygithub.github.Github;
import it.me.tae.mygithub.github.GithubApi;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import rx.Observable;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    public static final String GITHUB_BASE_URL = "https://api.github.com/";

    @Test
    public void addition_isCorrect() throws Exception {
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

        GithubApi api = retrofit.create(GithubApi.class);
        Observable<Github> obs = api.getGithubUser("kasun04");

        obs.subscribe(
                abc -> System.out.println(abc.getName()),
                t -> t.printStackTrace(),
                () -> System.out.println("complete")
        );


    }
}