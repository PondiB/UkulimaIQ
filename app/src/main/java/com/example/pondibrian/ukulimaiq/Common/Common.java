package com.example.pondibrian.ukulimaiq.Common;

import android.support.annotation.NonNull;

import java.text.DateFormat;

/**
 * Created by Pondi Brian on 3/12/2018.
 */

public class Common {
    public static String API_KEY = "c908487c4f3bc9ee3802b490411e80ab";
    public  static String API_LINK ="http://api.openweathermap.org/data/2.5/weather";


    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lng, API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new simpleDateFormat("HH:mm");
        date.setTime((long)unixTimeStamp*10000);
        return dateFormat.format(date);
    }

    public  static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png", icon);
    }
}
