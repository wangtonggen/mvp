package com.wang.mvp.basemvp;

import android.app.Application;


/**
 * author: admin 2019/3/20
 * desc:
 */
public class BaseApplication extends Application {
    public static BaseApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
