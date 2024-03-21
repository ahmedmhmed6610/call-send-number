package com.ahmed6610.callsendnumber;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ahmed6610.callsendnumber.R;


public class Mune extends Fragment {


    ImageView add ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_mune, container, false);

      add = view.findViewById(R.id.add);

      add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Navigation.findNavController(view).navigate(R.id.action_mune_to_page_ip);
//              Toast.makeText(getContext(), "تم نجاح تسجيل", Toast.LENGTH_LONG).show();
          }
      });




        return view;

    }



}