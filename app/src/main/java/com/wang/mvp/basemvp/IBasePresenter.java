package com.wang.mvp.basemvp;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * author: admin 2019/3/21
 * desc:
 */
public class IBasePresenter<T extends BaseView> implements BasePresenter<T> {
    protected CompositeDisposable mDisposables = new CompositeDisposable();
    protected T mView;

    /**
     * 绑定view
     * @param mView
     */
    public void attachView(T mView){
        this.mView = mView;
    }

    /**
     * 解绑view
     */
    public void unBindView(){
        mView = null;
    }

    /**
     * 加入订阅对象
     * @param disposable
     */
    public void addDisposable(Disposable disposable){
        mDisposables.add(disposable);
    }

    /**
     * 移除订阅对象
     * @param disposable
     */
    public void removeDisposable(Disposable disposable){
        mDisposables.remove(disposable);
    }
    /**
     * 取消所有请求
     */
    public void cancelRequest(){
        if (mDisposables.isDisposed()){
            mDisposables.dispose();
        }
    }

    /**
     * 及时解绑防止内存泄漏
     */
    public void desctory(){
        cancelRequest();
        unBindView();
    }
}
