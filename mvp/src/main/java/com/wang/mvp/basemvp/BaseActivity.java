package com.wang.mvp.basemvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

/**
 * author: admin 2019/3/20
 * desc: activity基类
 */
public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResLayoutId());
        ButterKnife.bind(this);
        initView();
    }

    /**
     * 点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {

    }

    /**
     * 获取资源id
     * @return 布局id
     */
   public abstract int getResLayoutId();

    /**
     * 初始化布局
     */
   public abstract void initView();


}
