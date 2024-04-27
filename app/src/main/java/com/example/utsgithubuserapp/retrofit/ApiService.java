package com.example.utsgithubuserapp.retrofit;

import com.example.utsgithubuserapp.data.response.GithubSearchResponse;
import com.example.utsgithubuserapp.data.response.GithubUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search/users")
    Call<GithubSearchResponse> searchUsers(@Query("q") String query);
    @GET("users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);


}