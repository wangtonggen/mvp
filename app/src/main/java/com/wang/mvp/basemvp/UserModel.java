package com.wang.mvp.basemvp;

import com.wang.mvp.LoginBean;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * author: admin 2019/3/20
 * desc: 用户的model
 */
public class UserModel {
   private UserService userService = ServiceFactory.getInstance().createService(UserService.class);

   /**
    * 登录
    * @param params
    * @param observer
    */
   public void login(Map<String,Object> params, BaseObserver<LoginBean> observer){
      userService.login(params).subscribeOn(Schedulers.io())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(observer);
   }
}
