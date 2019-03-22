package com.wang.mvp;

import com.wang.mvp.basemvp.BaseObserver;
import com.wang.mvp.basemvp.HttpResponse;
import com.wang.mvp.basemvp.IBasePresenter;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.disposables.Disposable;


/**
 * author: admin 2019/3/21
 * desc:
 */
public class LoginPresenter extends IBasePresenter<LoginView> {
    protected UserModel userModel = new UserModel();

    /**
     * 登录
     */
    public void login(){
        Map<String,Object> map = new HashMap<>();
        map.put("account",mView.getAccount());
        map.put("password",mView.getPassword());
        userModel.login(map, new BaseObserver<LoginBean>() {
            @Override
            public void onSubscribe(Disposable d) {
                addDisposable(d);
            }

            @Override
            public void onSuccess(HttpResponse<LoginBean> data) {
                mView.loginSuccess(data);
            }

            @Override
            public void error(String message) {
                mView.cancelDialog();
            }

            @Override
            public void complete() {
                mView.cancelDialog();
            }
        });
    }
}
