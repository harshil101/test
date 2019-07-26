package com.example.bisauli.util;

import com.example.bisauli.pojo.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BisauliService {
    @GET("read")
    Call<String> getAllPost();
}
