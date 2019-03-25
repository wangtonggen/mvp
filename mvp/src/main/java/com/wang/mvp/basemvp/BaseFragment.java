package com.wang.mvp.basemvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * author: admin 2019/3/24
 * desc: fragment的基类
 */
public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    private View mView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = getView(inflater,container);
        ButterKnife.bind(this,mView);
        initView();
        return mView;
    }

    public View getView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container){
        return inflater.inflate(getResLayoutId(),container,false);
    }

    @Override
    public void onClick(View v) {

    }

    /**
     * 获取资源id
     * @return id
     */
    public abstract @LayoutRes int getResLayoutId();

    /**
     * 初始化view
     */
    public abstract void initView();
}
