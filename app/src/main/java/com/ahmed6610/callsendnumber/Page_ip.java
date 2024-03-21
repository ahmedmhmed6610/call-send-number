package com.ahmed6610.callsendnumber;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.ahmed6610.callsendnumber.SharedPreferences.SharedPreferenceUtils;
import com.ahmed6610.callsendnumber.retrofit.RetrofitFactory;

import static android.content.Context.MODE_PRIVATE;

public class Page_ip extends Fragment {



    EditText text_ip;
    Button btn ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.pageip, container, false);
        text_ip = view.findViewById(R.id.edittextip);
        btn = view.findViewById(R.id.btn);
        SharedPreferences preferences = getActivity().getSharedPreferences(getActivity().getPackageName(), 0);
        String base_url = preferences.getString("ip", "");
        text_ip.setText(base_url);
//        text_ip.setText("192.168.1.25");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ip = text_ip.getText().toString().trim();
                //////////
                SharedPreferenceUtils.putString("ip",ip);
                /////
                Toast.makeText(getContext(),  R.string.save_data, Toast.LENGTH_LONG).show();
             //   text_ip.setText(sharedPreferences.getString("ip", null)); // getting String
            }
        });

        return view;

    }



}