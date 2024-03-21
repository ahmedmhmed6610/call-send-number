package com.ahmed6610.callsendnumber;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.ahmed6610.callsendnumber.data.data;
import com.ahmed6610.callsendnumber.retrofit.RetrofitFactory;
import com.ahmed6610.callsendnumber.retrofit.WebServices;

import java.util.Objects;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;


public class CallReceiver extends BroadcastReceiver {
    WebServices webServices;
    String savedNumber;
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(final Context context, Intent intent) {
        webServices = RetrofitFactory.getRetrofit().create(WebServices.class);
        String number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
        String number1 = intent.getExtras().getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
//        if(intent.getStringExtra(TelephonyManager.EXTRA_STATE).equals(TelephonyManager.EXTRA_STATE_OFFHOOK)){
//        }
//        else if(intent.getStringExtra(TelephonyManager.EXTRA_STATE).equals(TelephonyManager.EXTRA_STATE_IDLE)){
//            showToast(context,"Call ended...");
//        }
        if (intent.getStringExtra(TelephonyManager.EXTRA_STATE).equals(TelephonyManager.EXTRA_STATE_RINGING)) {
//          showToast(context,"Incoming call...");
            if(number1!=null){
                showToast(context, "Number : " + number1);
            }

            data da = new data(number);
            Call<data> call = webServices.number(da);
            call.enqueue(new Callback<data>() {
                @Override
                public void onResponse(Call<data> call, Response<data> response) {

//                        if(response.isSuccessful()){
//                            //   String token = response.body().toString();
//                            showToast(context,"number : "+ number);
//
//                        }

                }

                @Override
                public void onFailure(Call<data> call, Throwable t) {
                    showToast(context, t.getMessage());
                }
            });

            /////////////////
//            Call<ResponseBody> call = webServices.number(0,number);
//
//            call.enqueue(new Callback<ResponseBody>() {
//                @Override
//                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//
//
//                }
//                @Override
//                public void onFailure(Call<ResponseBody> call, Throwable t) {
//                    showToast(context,t.getMessage());
//                }
//            });
            ////////////////
        }
//
////        if(intent.getAction().equals("android.intent.action.PHONE_STATE")){
////            String number1 = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
////            String state = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
////            showToast(context,"number: " + number1 );
////        }
//    }

    }

    void showToast(Context context,String message){
        Toast toast=Toast.makeText(context,message,Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

}

