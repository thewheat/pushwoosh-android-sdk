package com.pushwoosh.sample;

import android.app.Application;

import io.intercom.android.sdk.Intercom;

public class CustomApplication extends Application {
    private static final String YOUR_API_KEY = "";
    private static final String YOUR_APP_ID = "";
    @Override
    public void onCreate() {
        super.onCreate();
        Intercom.initialize(this, YOUR_API_KEY, YOUR_APP_ID);
    }
}
