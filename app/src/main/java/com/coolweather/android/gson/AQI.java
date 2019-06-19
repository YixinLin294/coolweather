package com.coolweather.android.gson;

/**
 * Created by linyixin on 2019/6/19.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
