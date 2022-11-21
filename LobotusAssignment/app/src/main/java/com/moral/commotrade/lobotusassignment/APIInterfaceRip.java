package com.moral.commotrade.lobotusassignment;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterfaceRip {


    @POST("rotomag/api/Installations/PostRidDetails/")
    Call<RidResult> doCreateUserWithField(@Body UserRequest body);
}
