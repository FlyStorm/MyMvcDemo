package com.fi.mymvcdemo.model;

/**
 * Description:请求网络数据接口
 */

public interface WeatherModel {
    void getWeather(String cityNumber, OnWeatherListener listener);
}
