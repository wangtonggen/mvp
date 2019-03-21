package com.wang.mvp;

import com.wang.mvp.basemvp.BaseView;
import com.wang.mvp.basemvp.HttpResponse;


/**
 * author: admin 2019/3/21
 * desc:
 */
public interface LoginView extends BaseView {
    String getAccount();
    String getPassword();
    void setAccount(String account);
    void setPassword(String password);
    void loginSuccess(HttpResponse<LoginBean> data);
}
