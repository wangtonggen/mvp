package com.wang.mvp.basemvp;

import io.reactivex.Observer;

/**
 * author: admin 2019/3/21
 * desc:
 */
abstract public class BaseObserver<T> implements Observer<HttpResponse<T>> {
    private String TAG = getClass().getSimpleName();

    @Override
    public void onNext(HttpResponse<T> tHttpResponse) {
        onSuccess(tHttpResponse);
    }

    @Override
    public void onError(Throwable e) {
        error(e.getMessage());
    }

    @Override
    public void onComplete() {
        complete();
    }

    public abstract void onSuccess(HttpResponse<T> data);
    public abstract void error(String message);
    public abstract void complete();
}
