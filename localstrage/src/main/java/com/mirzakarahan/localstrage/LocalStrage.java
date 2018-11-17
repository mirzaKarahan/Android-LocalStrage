package com.mirzakarahan.localstrage;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class LocalStrage {

    private static SharedPreferences getSharedPrefences(Context context) {
        return context.getSharedPreferences("APP_PREF",Context.MODE_PRIVATE);
    }

    public static void setArrayListInteger(Context context, String key, ArrayList<Integer> value){
        String result = "";
        if (value.size()>0) {
            for (int row : value) {
                result += String.valueOf(row) + ",";
            }
            result = result.substring(0, result.length() - 1);
        }
        setValue(context,key,result);
    }
    public static void setArrayListString(Context context, String key, ArrayList<String> value){
        String result = "";
        if (value.size()>0) {
            for (String row : value) {
                result += row + "/,";
            }
            result = result.substring(0, result.length() - 2);
        }
        setValue(context,key,result);
    }
    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setValue(Context context,String key,String value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putString(key,String.valueOf(value));
        editor.apply();
    }
    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setValue(Context context,String key,int[] value){
        String result = "";
        if (value.length>0) {
            for (int row : value) {
                result += String.valueOf(row) + ",";
            }
            result = result.substring(0, result.length() - 1);
        }
        setValue(context,key,result);
    }
    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setValue(Context context,String key,String[] value){
        String result = "";
        if (value.length>0){
            for (String row:value){
                result +=row+"/,";
            }
            result = result.substring(0,result.length() - 2);
        }
        setValue(context,key,result);
    }
    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setValue(Context context,String key,Integer value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putInt(key,Integer.valueOf(value));
        editor.apply();
    }
    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setValue(Context context,String key,Boolean value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putBoolean(key,Boolean.valueOf(value));
        editor.apply();
    }
    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setValue(Context context,String key,float value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putFloat(key,Float.valueOf(value));
        editor.apply();
    }
    /**
     * @param context
     * @param key
     * @param value
     */
    public static void setValue(Context context,String key,long value){
        SharedPreferences.Editor editor = getSharedPrefences(context).edit();
        editor.putLong(key,Long.valueOf(value));
        editor.apply();
    }
    /**
     * @param context
     * @param key
     * @return
     */
    public static Boolean getValue(Context context,String key,Boolean defaultVal){
        return getSharedPrefences(context).getBoolean(key,defaultVal);
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static String getValue(Context context,String key,String defaultVal){
        return getSharedPrefences(context).getString(key,defaultVal);
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static int[] getValue(Context context,String key,int[] defaultVal){
        String text = getSharedPrefences(context).getString(key,"0,1");
        if (text.length()<1) {
            return defaultVal;
        }else {
            String[] text2 = text.split(",");
            int[] result = new int[text2.length];
            for (int i = 0; i < text2.length; i++) {
                result[i] = Integer.valueOf(text2[i]);
            }
            return result;
        }
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static ArrayList<Integer> getArrayListInteger(Context context,String key,ArrayList<Integer> defaultVal){
        String text = getSharedPrefences(context).getString(key,"0,1");
        if (text.length()<1) {
            return defaultVal;
        }else {
            String[] text2 = text.split(",");
            ArrayList<Integer> result = new ArrayList<>();
            for (String row : text2){
                result.add(Integer.valueOf(row));
            }
            return result;
        }
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static ArrayList<String> getArrayListString(Context context,String key,ArrayList<String> defaultVal){
        String text = getSharedPrefences(context).getString(key,"0,1");
        if (text.length()<1) {
            return defaultVal;
        }else {
            String[] text2 = text.split("/,");
            ArrayList<String> result = new ArrayList<>();
            for (String row : text2){
                result.add(row);
            }
            return result;
        }
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static Integer getValue(Context context,String key,Integer defaultVal){
        return getSharedPrefences(context).getInt(key,defaultVal);
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static float getValue(Context context,String key,float defaultVal){
        return getSharedPrefences(context).getFloat(key,defaultVal);
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static long getValue(Context context,String key,long defaultVal){
        return getSharedPrefences(context).getLong(key,defaultVal);
    }
    /**
     * @param context
     * @param key
     * @param defaultVal
     * @return
     */
    public static String[] getValue(Context context,String key,String[] defaultVal){
        return getValue(context,key,"0/,1").split("/,");
    }
}
