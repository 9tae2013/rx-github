package it.me.tae.mygithub.github;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by realize on 25/3/2559.
 */
public interface GithubApi {
    @GET("users/{username}")
    Observable<Github> getGithubUser(@Path("username") String username);
}
