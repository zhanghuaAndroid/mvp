package com.eoffcn.mvpapplication.activity;

import com.eoffcn.mvpapplication.R;
import com.eoffcn.mvpapplication.presenter.TestPresenter;
import com.eoffcn.mvpapplication.view.TestView;
import com.example.lib_zh_mvp.mvp.activity.BaseMVPActivity;

public class TestActivity extends BaseMVPActivity implements TestView {

    private TestPresenter mPresenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_test;
    }

    @Override
    protected void initPresenter() {
        mPresenter = new TestPresenter();
    }

    @Override
    protected void initData() {
        mPresenter.getData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.attachView(this);
    }


    @Override
    protected void initListener() {

    }

    @Override
    public void onSuccessUI() {

    }

    @Override
    public void onErrorUI() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
