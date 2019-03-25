package com.wang.mvp.basemvp;

import android.text.TextUtils;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: admin 2019/3/20
 * desc: service创建
 */
public class ServiceFactory {
    private String TAG = getClass().getSimpleName();
    private String base_url = "";//基础url
    private static ServiceFactory mServiceFactory;
    //默认时间
    private static int DEFAULT_TIME = 30;
    private OkHttpClient.Builder builder;
    private Retrofit retrofit;

    /**
     * 单例模式创建生产service工厂
     *
     * @return
     */
    public static ServiceFactory getInstance() {
        if (mServiceFactory == null) {
            synchronized (ServiceFactory.class) {
                if (mServiceFactory == null) {
                    mServiceFactory = new ServiceFactory();
                }
            }
        }
        return mServiceFactory;
    }

    /**
     * 创建service
     * @param service
     * @param <T>
     * @return
     */
    public <T> T createService(Class<T> service) {
        if (TextUtils.isEmpty(base_url)){
            throw new RuntimeException("请先设置BASE_URL");
        }
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(base_url).client(getOkHttpClient()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        }
        return retrofit.create(service);
    }

    /**
     * 初始化okhttp
     * @return
     */
    private OkHttpClient getOkHttpClient() {
        if (builder == null){
            throw new RuntimeException("OkHttpClient.Builder is null");
        }
        return builder.build();
    }

    /**
     * 设置okhttp
     * @param builder
     */
    public void setOkHttpClient(OkHttpClient.Builder builder){
        if (builder == null){
            this.builder = builder;
        }
    }

    /**
     * 设置baseurl
     * @param base_url
     */
    public void setBaseUrl(String base_url){
        this.base_url = base_url;
    }
}
