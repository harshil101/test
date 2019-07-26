package com.example.bisauli.util.impl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class BisauliServiceBean {
    static final String baseUrl = "http://avpra.com/bisauli/api/news/";

    public static Retrofit getRetroFitInstance() {
    return new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();
    }

}
