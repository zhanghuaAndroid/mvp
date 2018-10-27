package com.example.lib_zh_mvp.mvp.model;

import com.example.lib_zh_mvp.mvp.CallBack;

import java.util.Map;

public class BaseModel <T> {
    /**
     * 请求参数
     */
    String[] mParams;

    public  BaseModel params(String... args){
        mParams = args;
        return this;
    }

    /**
     * 执行Get网络请求，此类看需求由自己选择写与不写
     */
    protected void requestGetAPI(String url,CallBack<T> callback){
        //这里写具体的网络请求
    }
    /**
     *执行Post网络请求，此类看需求由自己选择写与不写
     */
    protected void requestPostAPI(String url, Map params, CallBack<T> callback){
        //这里写具体的网络请求
    }

}
