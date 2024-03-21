package com.ahmed6610.callsendnumber.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class data {

    private int id = 0;
    private String Number ;

    public data() {
    }

    public data(String number) {
        Number = number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}
