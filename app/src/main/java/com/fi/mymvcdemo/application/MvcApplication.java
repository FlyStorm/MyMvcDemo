package com.fi.mymvcdemo.application;

import android.app.Application;

import com.fi.mymvcdemo.volley.VolleyRequest;

public class MvcApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}
