package com.fi.mymvcdemo.model;

import com.fi.mymvcdemo.entity.Weather;

/**
 * Description:得到网络请求结果接口
 */

public interface OnWeatherListener {
    void onSuccess(Weather weather);

    void onError();
}
