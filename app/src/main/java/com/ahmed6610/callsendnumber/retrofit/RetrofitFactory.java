package com.ahmed6610.callsendnumber.retrofit;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.ahmed6610.callsendnumber.SharedPreferences.SharedPreferenceUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class RetrofitFactory {

    public static SharedPreferences preferences;
      Context context ;
    private static String base_url = SharedPreferenceUtils.getString("ip","");

    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
     String name = sharedPreferences.getString("id", "default value");

    public static final String BASE_URL = "http://"+base_url+":96/";
//    public static final String BASE_URL = "http://"+base_url+"/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit;
    }

}
