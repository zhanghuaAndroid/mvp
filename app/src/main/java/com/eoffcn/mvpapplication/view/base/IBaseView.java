package com.eoffcn.mvpapplication.view.base;

import com.eoffcn.mvpapplication.model.entity.ResultBean;

import java.util.List;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.view
 * @fileName IBaseView
 * @date 2018/10/23 16:06
 * @org www.offcn.com
 * @email
 * @description
 */
public interface IBaseView {
    void showLoading();
    void hideLoading();
    void showToast();
    void showDataAndUpdateUI(List<ResultBean> resultBeans);
    void showError(int errorCode, String msg);
}
