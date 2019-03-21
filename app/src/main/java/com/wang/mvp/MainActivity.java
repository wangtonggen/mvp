package com.wang.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wang.mvp.basemvp.HttpResponse;

public class MainActivity extends AppCompatActivity implements LoginView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
