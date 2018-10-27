package com.example.lib_zh_mvp.mvp;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.model
 * @fileName CallBack
 * @date 2018/10/24 10:54
 * @org www.offcn.com
 * @email
 * @description
 */
public interface CallBack<T> {
    void onSuccess(int responseCode, T t);
    void onError(int errorCode, String msg);
}
