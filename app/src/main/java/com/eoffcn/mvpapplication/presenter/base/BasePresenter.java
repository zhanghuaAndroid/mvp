package com.eoffcn.mvpapplication.presenter.base;

import com.eoffcn.mvpapplication.activity.base.BaseActivity;
import com.eoffcn.mvpapplication.view.base.IBaseView;

import java.lang.ref.WeakReference;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.presenter
 * @fileName BasePresenter
 * @date 2018/10/23 16:16
 * @org www.offcn.com
 * @email
 * @description
 */
public abstract class BasePresenter<V extends IBaseView> {
    private V mIView;

    public BasePresenter(V v) {

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
    public boolean isViewAttached() {
        return mIView != null;
    }

    /**
     * 获取连接的view
     */
    public V getView() {
        return mIView;
    }

    /**
     * 获取数据由子类实现
     */
    public abstract void getData();
}
