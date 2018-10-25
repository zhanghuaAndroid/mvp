package com.eoffcn.mvpapplication.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.eoffcn.mvpapplication.R;
import com.eoffcn.mvpapplication.activity.base.BaseActivity;
import com.eoffcn.mvpapplication.adapter.SongPoetryAdapter;
import com.eoffcn.mvpapplication.model.entity.ResultBean;
import com.eoffcn.mvpapplication.presenter.TestPresenter;
import com.eoffcn.mvpapplication.view.ITestView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.activity
 * @fileName TestActivity
 * @date 2018/10/24 11:09
 * @org www.offcn.com
 * @email
 * @description
 */
public class TestActivity extends BaseActivity implements ITestView {
    private TestPresenter mPresenter;
    private RecyclerView rvList;
    private List<ResultBean> mResultBeans;
    private SongPoetryAdapter songPoetryAdapter;
    @Override
    public int getLayout() {
        return R.layout.activity_test;
    }

    @Override
    public void initData() {
        mPresenter = new TestPresenter(this);
        mResultBeans = new ArrayList<>();
        mPresenter.getData();
    }

    @Override
    public void initView() {
        mPresenter.attachView(this);
        rvList = findViewById(R.id.rv_list);
    }

    @Override
    public void initListener() {
        rvList.setLayoutManager(new LinearLayoutManager(mActivity));
        songPoetryAdapter = new SongPoetryAdapter(R.layout.layout_list_item, mResultBeans);
        rvList.setAdapter(songPoetryAdapter);
    }

    @Override
    public void showDataAndUpdateUI(List<ResultBean> resultBeans) {
        if (mResultBeans.size() != 0){
            mResultBeans.clear();
        }
        mResultBeans.addAll(resultBeans);
        songPoetryAdapter.notifyDataSetChanged();
    }

    @Override
    public void showError(int errorCode, String msg) {
        super.showError(errorCode, msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
