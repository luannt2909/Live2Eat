package com.example.nguyentanluan.livetoeat.api.common;

import com.example.nguyentanluan.livetoeat.utils.AppConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nguyen Tan Luan on 3/18/2017.
 */

public class ApiConnection {
    private Retrofit mRetrofit;
    public static ApiConnection instance=new ApiConnection();

    public ApiConnection() {
        Gson gson=new GsonBuilder().create();
        mRetrofit=new Retrofit.Builder()
                .baseUrl(AppConstants.HOST)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public Retrofit getmRetrofit() {
        return mRetrofit;
    }
}
