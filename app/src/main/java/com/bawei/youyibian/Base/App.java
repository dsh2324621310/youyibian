package com.bawei.youyibian.Base;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static Context applacation;

    @Override
    public void onCreate() {
        super.onCreate();
        applacation=getApplicationContext();
    }

    public static Context getAppContext(){
        return applacation;
    }

}
