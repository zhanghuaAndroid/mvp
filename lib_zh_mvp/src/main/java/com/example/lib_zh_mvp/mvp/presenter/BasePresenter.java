package com.example.lib_zh_mvp.mvp.presenter;

import com.example.lib_zh_mvp.mvp.view.IBaseView;

public abstract class BasePresenter<V extends IBaseView> {
    private V mIView;

    public BasePresenter() {

    }

    /**
     * 绑定view，一般在初始化中调用该方法
     */
    public void attachView(V mvpView) {
        this.mIView = mvpView;
    }

    /**
     * 断开view，一般在onDestroy中调用
     */
    public void detachView() {
        this.mIView = null;
    }

    /**
     * 是否与View建立连接
     * 每次调用业务请求的时候都要出先调用方法检查是否与View建立连接
     */
    protected boolean isViewAttached() {
        return mIView != null;
    }

    /**
     * 获取连接的view
     */
    protected V getView() {
        return mIView;
    }

    /**
     * 获取数据由子类实现
     */
    public abstract void getData();
}
