package com.wang.mvp;

import android.support.v7.widget.AppCompatTextView;

import com.wang.mvp.basemvp.BaseFragment;

import butterknife.BindView;


/**
 * author: admin 2019/3/24
 * desc: case示例
 */
public class MyFragment extends BaseFragment {
    @BindView(R.id.tv_title)
    AppCompatTextView tv_title;
    @Override
    public int getResLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    public void initView() {
        tv_title.setText("hello fragment");
    }
}
