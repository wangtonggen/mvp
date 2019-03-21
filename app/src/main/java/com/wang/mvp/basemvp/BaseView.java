package com.wang.mvp.basemvp;

/**
 * author: admin 2019/3/20
 * desc: view基类
 */
public interface BaseView {
    void showDialog();
    void cancelDialog();
    void showToast(String message);
}
