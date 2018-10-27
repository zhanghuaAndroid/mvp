package com.eoffcn.mvpapplication.presenter;

import com.eoffcn.mvpapplication.model.TestModel;
import com.eoffcn.mvpapplication.view.TestView;
import com.example.lib_zh_mvp.mvp.CallBack;
import com.example.lib_zh_mvp.mvp.presenter.BasePresenter;

public class TestPresenter extends BasePresenter<TestView> {
    private TestModel testModel;
    public TestPresenter() {
        super();
        testModel = new TestModel();
    }

    @Override
    public void getData() {
        if (isViewAttached()){
            return;
        }
        CallBack<String> callBack = new CallBack<String>() {
            @Override
            public void onSuccess(int responseCode, String s) {
                getView().onSuccessUI();
            }

            @Override
            public void onError(int errorCode, String msg) {
                getView().onErrorUI();
            }
        };
        testModel.getTestData(callBack);
    }
}
