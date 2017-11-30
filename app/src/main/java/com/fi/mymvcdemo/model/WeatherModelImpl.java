package com.fi.mymvcdemo.model;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.fi.mymvcdemo.entity.Weather;
import com.fi.mymvcdemo.volley.VolleyRequest;

/**
 * Description:从网络获取天气信息接口实现
 */

public class WeatherModelImpl implements WeatherModel {

    @Override
    public void getWeather(String cityNumber, final OnWeatherListener listener) {

        /*数据层操作*/
        VolleyRequest.newInstance().newGsonRequest("http://www.weather.com.cn/data/sk/" + cityNumber + ".html",
                Weather.class, new Response.Listener<Weather>() {
                    @Override
                    public void onResponse(Weather weather) {
                        if (weather != null) {
                            listener.onSuccess(weather);
                        } else {
                            listener.onError();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError();
                    }
                });
    }
}
