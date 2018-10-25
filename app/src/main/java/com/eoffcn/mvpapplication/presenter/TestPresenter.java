package com.eoffcn.mvpapplication.presenter;

import com.eoffcn.mvpapplication.model.CallBack;
import com.eoffcn.mvpapplication.model.TestModel;
import com.eoffcn.mvpapplication.model.entity.ResultBean;
import com.eoffcn.mvpapplication.presenter.base.BasePresenter;
import com.eoffcn.mvpapplication.view.ITestView;

import java.util.List;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.presenter
 * @fileName TestPresenter
 * @date 2018/10/24 10:43
 * @org www.offcn.com
 * @email
 * @description
 */
public class TestPresenter extends BasePresenter<ITestView> {

    private TestModel testModel;

    public TestPresenter(ITestView iTestView) {
        super(iTestView);
        testModel = new TestModel();
    }

    @Override
    public void getData() {
        if (isViewAttached()){
            return;
        }
        CallBack<List<ResultBean>> callBack = new CallBack<List<ResultBean>>() {

            @Override
            public void onSuccess(int responseCode, List<ResultBean> resultBeans) {
                getView().showDataAndUpdateUI(resultBeans);
            }

            @Override
            public void onError(int errorCode, String msg) {
                getView().showError(errorCode,msg);
            }

        };
        testModel.getData(callBack);
    }
}
