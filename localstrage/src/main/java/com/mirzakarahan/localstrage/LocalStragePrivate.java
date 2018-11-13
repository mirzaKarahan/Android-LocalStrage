package com.mirzakarahan.localstrage;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStragePrivate {

    private String  NAME;
    private Context CONTEXT;
    private Integer MODE;

    /**
     *
     * @param CONTEXT
     * @param NAME
     * @param MODE
     */
    public LocalStragePrivate(Context CONTEXT,String NAME,Integer MODE) {
        this.NAME    = NAME;
        this.MODE    = MODE;
        this.CONTEXT = CONTEXT;
    }
    private SharedPreferences getSharedPrefences(Context context) {
        return context.getSharedPreferences(this.NAME,this.MODE);
    }

    /**
     * @param key
     * @param value
     */
    public void setValue(String key,String value){
        SharedPreferences.Editor editor = getSharedPrefences(this.CONTEXT).edit();
        editor.putString(key,String.valueOf(value));
        editor.apply();
    }
    /**
     * @param key
     * @param value
     */
    public void setValue(String key,Boolean value){
        SharedPreferences.Editor editor = getSharedPrefences(this.CONTEXT).edit();
        editor.putBoolean(key,Boolean.valueOf(value));
        editor.apply();
    }
    /**
     * @param key
     * @param value
     */
    public void setValue(String key,Integer value){
        SharedPreferences.Editor editor = getSharedPrefences(this.CONTEXT).edit();
        editor.putInt(key,Integer.valueOf(value));
        editor.apply();
    }
    /**
     * @param key
     * @param value
     */
    public void setValue(String key,float value){
        SharedPreferences.Editor editor = getSharedPrefences(this.CONTEXT).edit();
        editor.putFloat(key,Float.valueOf(value));
        editor.apply();
    }
    /**
     * @param key
     * @param value
     */
    public void setValue(String key,long value){
        SharedPreferences.Editor editor = getSharedPrefences(this.CONTEXT).edit();
        editor.putLong(key,Long.valueOf(value));
        editor.apply();
    }
    /**
     * @param key
     * @param defaultVal
     * @return
     */
    public String getValue(String key,String defaultVal){
        return getSharedPrefences(this.CONTEXT).getString(key,defaultVal);
    }
    /**
     * @param key
     * @param defaultVal
     * @return
     */
    public Boolean getValue(String key,Boolean defaultVal){
        return getSharedPrefences(this.CONTEXT).getBoolean(key,defaultVal);
    }
    /**
     * @param key
     * @param defaultVal
     * @return
     */
    public Integer getValue(String key,Integer defaultVal){
        return getSharedPrefences(this.CONTEXT).getInt(key,defaultVal);
    }
    /**
     * @param key
     * @param defaultVal
     * @return
     */
    public float getValue(String key,float defaultVal){
        return getSharedPrefences(this.CONTEXT).getFloat(key,defaultVal);
    }
    /**
     * @param key
     * @param defaultVal
     * @return
     */
    public long getValue(String key,long defaultVal){
        return getSharedPrefences(this.CONTEXT).getLong(key,defaultVal);
    }
}
