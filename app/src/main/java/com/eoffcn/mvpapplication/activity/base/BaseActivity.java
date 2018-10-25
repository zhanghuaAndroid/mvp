package com.eoffcn.mvpapplication.activity.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.eoffcn.mvpapplication.view.base.IBaseView;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.activity.base
 * @fileName BaseActivity
 * @date 2018/10/23 16:20
 * @org www.offcn.com
 * @email
 * @description
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseView {
    protected Activity mActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        setContentView(getLayout());
        initData();
        initView();
        initListener();
    }

    public abstract int getLayout();

    public abstract void initData();

    public abstract void initView();

    public abstract void initListener();

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showToast() {

    }

    @Override
    public void showError(int errorCode, String msg) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
