package com.example.yj.ui.network;

import com.example.yj.ui.accompany.entity.Accompany;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Api声明示例
 */
public interface ApiDemo
{

//    //https://api.github.com/users/thymleaf/repos
//    @GET("users/{user}/repos")
//    Call<List<Repo>> listRepos(@Path("user") String user);
//
//
//    @GET("users/{user}/repos")
//    Flowable<List<Repo>> getRepos(@Path("user") String user);
//
//
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId);
//
//
//    //https://api.github.com/users/list?sort=desc
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);
//
//
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId, @QueryMap Map<String, String> options);

    @GET("accompany/listAccompany")
    Flowable<List<Accompany>> getAccompany();
}
