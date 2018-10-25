package com.eoffcn.mvpapplication.application;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.application
 * @fileName App
 * @date 2018/10/24 16:08
 * @org www.offcn.com
 * @email
 * @description
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initOkGo();
    }

    private void initOkGo() {
        OkGo.getInstance().init(this);
    }
}
