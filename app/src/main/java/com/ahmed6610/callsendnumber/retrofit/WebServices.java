package com.ahmed6610.callsendnumber.retrofit;



import com.ahmed6610.callsendnumber.data.data;
import com.google.gson.JsonObject;

import java.util.Date;
import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface WebServices {

// @FormUrlEncoded
  @Headers("Content-Type: application/json")
// @POST("ahmed/index.php")
  @POST("api/PhoneNumbres")
//    Call<ResponseBody> number(@Field("id") int id , @Field("Number") String number);
     Call<data> number(@Body data data);


}
