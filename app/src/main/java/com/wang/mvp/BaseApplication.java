package com.wang.mvp;

import android.app.Application;

import com.wang.mvp.basemvp.ServiceFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;


/**
 * author: admin 2019/3/24
 * desc:
 */
public class BaseApplication extends Application {
    public static BaseApplication baseApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;

        initMVP();
    }

    /**
     * 初始化baseUrl和OKhttp client
     */
    private void initMVP(){
        ServiceFactory.getInstance().setBaseUrl("http://baidu.com");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30, TimeUnit.SECONDS);
        builder.connectTimeout(30,TimeUnit.SECONDS);
        builder.connectionPool(new ConnectionPool(20,5,TimeUnit.MINUTES));
//        builder.addInterceptor();//添加拦截器
        ServiceFactory.getInstance().setOkHttpClient(builder);
    }
}
