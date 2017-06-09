package com.example.pagertab.Global;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by orchid
 * on 16-10-7.
 */

public class MyApplication  extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
