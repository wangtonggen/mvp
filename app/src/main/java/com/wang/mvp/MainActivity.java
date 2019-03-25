package com.wang.mvp;

import android.widget.TextView;

import com.wang.mvp.basemvp.BaseActivity;
import com.wang.mvp.basemvp.HttpResponse;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements LoginView{
    @BindView(R.id.tv_test)
    TextView tv_test;
    @Override
    public int getResLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        tv_test.setText("hello wtg");
    }

    @Override
    public String getAccount() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setAccount(String account) {

    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public void loginSuccess(HttpResponse<LoginBean> data) {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void cancelDialog() {

    }

    @Override
    public void showToast(String message) {

    }
}
