package com.moral.commotrade.lobotusassignment;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIInterface {
//    @Headers({"Content-Type: application/json"})
    @POST("rotomag/api/Installations/PostOemOrBidDetails/")
    Call<Result> doCreateUserWithField(@Body UserRequest body);

}


