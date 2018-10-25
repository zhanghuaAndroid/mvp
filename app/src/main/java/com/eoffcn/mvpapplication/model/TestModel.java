package com.eoffcn.mvpapplication.model;

import android.util.Log;

import com.eoffcn.mvpapplication.model.entity.ResultBean;
import com.eoffcn.mvpapplication.model.entity.SongPoetryEntity;
import com.eoffcn.mvpapplication.utils.OkGoUtils;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.List;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.model
 * @fileName TestModel
 * @date 2018/10/24 10:53
 * @org www.offcn.com
 * @email
 * @description
 */
public class TestModel {
    public void getData(final CallBack<List<ResultBean>> callBack){
//        OkGoUtils.okGoGet("http://api.apiopen.top/getSongPoetry?page=1&count=20",callBack);
        OkGo.<String>get("http://api.apiopen.top/getSongPoetry?page=1&count=20")
                .tag(this)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        Log.d("response", "onSuccess: " + response.body());
                        Gson gson = new Gson();
                        SongPoetryEntity songPoetryEntity = gson.fromJson(response.body(), SongPoetryEntity.class);
                        int code = songPoetryEntity.getCode();
                        String message = songPoetryEntity.getMessage();
                        if (code == 200) {
                            List<ResultBean> result = songPoetryEntity.getResult();
                            callBack.onSuccess(code, result);
                        }else{
                            callBack.onError(code,message);
                        }
                    }
                });
    }
}
