package com.ahmed6610.callsendnumber;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ahmed6610.callsendnumber.data.data;
import com.ahmed6610.callsendnumber.retrofit.RetrofitFactory;
import com.ahmed6610.callsendnumber.retrofit.WebServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class Testdata extends AppCompatActivity{

    EditText text;
    WebServices webServices;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        text = findViewById(R.id.edittext);
        btn = findViewById(R.id.btn);
        webServices = RetrofitFactory.getRetrofit().create(WebServices.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textt = text.getText().toString().trim();
//                Call<ResponseBody> call = webServices.number(0,"1112222");
//                call.enqueue(new Callback<ResponseBody>() {
//                    @Override
//                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//
//                        if(response.isSuccessful()){
//                       //   String token = response.body().toString();
//                            Toast.makeText(getApplication(), "تم نجاح تسجيل", Toast.LENGTH_LONG).show();
//
//                     }
//
//                    }
//                    @Override
//                    public void onFailure(Call<ResponseBody> call, Throwable t) {
//                     Toast.makeText(getApplication(), t.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });

                  /////////////////

//                Call<JsonObject> call = webServices.number( 1,timee);
//                call.enqueue(new Callback<JsonObject>() {
//                    @Override
//                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                        Toast.makeText(getApplication(), "تم نجاح تسجيل", Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<JsonObject> call, Throwable t) {
//                        Toast.makeText(getApplication(), t.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });
                ////////////////////////

//                data da = new data(textt);
//                Call<data> call = webServices.number(da);
//
//                call.enqueue(new Callback<data>() {
//                    @Override
//                    public void onResponse(Call<data> call, Response<data> response) {
//
//                        if(response.isSuccessful()){
//                            //   String token = response.body().toString();
//                            Toast.makeText(getApplication(), "تم نجاح تسجيل", Toast.LENGTH_LONG).show();
//
//                        }
//
//                    }
//                    @Override
//                    public void onFailure(Call<data> call, Throwable t) {
//                        Toast.makeText(getApplication(), t.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });

                /////////////////////////

            }
        });



    }



}

