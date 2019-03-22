package com.wang.mvp;

import com.wang.mvp.LoginBean;
import com.wang.mvp.basemvp.BaseObservable;
import com.wang.mvp.basemvp.BaseService;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * author: admin 2019/3/20
 * desc:
 */
public interface UserService extends BaseService {
    @FormUrlEncoded
    @POST(API.URL_LOGIN)
    BaseObservable<LoginBean> login(@FieldMap Map<String, Object> params);
}
