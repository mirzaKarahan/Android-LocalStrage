package com.mirzakarahan.localstrage;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStrage {
    private static SharedPreferences getSharedPrefences(Context context) {
        return context.getSharedPreferences("APP_PREF",Context.MODE_PRIVATE);
    }

    public static void setValue(Context context,String key,String value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putString(key,String.valueOf(value));
        editor.apply();
    }
    public static void setValue(Context context,String key,Integer value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putInt(key,Integer.valueOf(value));
        editor.apply();
    }
    public static void setValue(Context context,String key,Boolean value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putBoolean(key,Boolean.valueOf(value));
        editor.apply();
    }
    public static void setValue(Context context,String key,float value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putFloat(key,Float.valueOf(value));
        editor.apply();
    }
    public static void setValue(Context context,String key,long value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putLong(key,Long.valueOf(value));
        editor.apply();
    }

    public static Boolean getValue(Context context,String key){
        return getSharedPrefences(context).getBoolean(key,false);
    }
    public static String getValue(Context context,String key,String defaultVal){
        return getSharedPrefences(context).getString(key,defaultVal);
    }
    public static Integer getValue(Context context,String key,Integer defaultVal){
        return getSharedPrefences(context).getInt(key,defaultVal);
    }
    public static float getValue(Context context,String key,float defaultVal){
        return getSharedPrefences(context).getFloat(key,defaultVal);
    }
    public static long getValue(Context context,String key,long defaultVal){
        return getSharedPrefences(context).getLong(key,defaultVal);
    }


}
