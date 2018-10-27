package com.eoffcn.mvpapplication.model;

import android.util.Log;

import com.example.lib_zh_mvp.mvp.CallBack;
import com.example.lib_zh_mvp.mvp.model.BaseModel;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

public class TestModel extends BaseModel {

    public static final String TAG = "TestModel";

    public void getTestData(CallBack<String> callBack) {
        OkGo.<String>get("https://www.apiopen.top/meituApi?page=1")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        Log.d(TAG, "onSuccess: " + response.body());
                    }
                });
    }
}
