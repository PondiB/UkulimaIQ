package com.example.pondibrian.ukulimaiq.Common;

/**
 * Created by Pondi Brian on 3/12/2018.
 */

public class Common {
    public static String API_KEY = "";
    public  static String API_LINK ="http://api.openweathermap.org/data/2.5/weather";


    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lng, API_KEY));
        return sb.toString();
    }
}
