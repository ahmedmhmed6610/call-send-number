package com.ahmed6610.callsendnumber.SharedPreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class SharedPreferenceUtils {

    private static SharedPreferences prefs;
    private static SharedPreferences.Editor editor;
        private SharedPreferenceUtils()
    {

    }

    public static void init(Context context) {
        if (prefs == null) {
            prefs = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
            editor = prefs.edit();
        }
    }
    public static void putString(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }



    public static String getString(String key, String defValue) {
        return prefs.getString(key, defValue);
    }
}