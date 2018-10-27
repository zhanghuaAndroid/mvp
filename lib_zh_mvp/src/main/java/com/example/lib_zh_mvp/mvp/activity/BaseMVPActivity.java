package com.example.lib_zh_mvp.mvp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lib_zh_mvp.mvp.view.IBaseView;


public abstract class BaseMVPActivity extends AppCompatActivity implements IBaseView {
    protected Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        setContentView(getLayout());
        initPresenter();
        initData();
        initView();
        initListener();
    }

    protected abstract int getLayout();

    protected abstract void initPresenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void initListener();
}
