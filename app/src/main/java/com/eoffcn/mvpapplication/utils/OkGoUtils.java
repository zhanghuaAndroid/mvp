package com.eoffcn.mvpapplication.utils;

import com.eoffcn.mvpapplication.model.CallBack;
import com.eoffcn.mvpapplication.model.entity.ResultBean;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.model.Response;

import java.util.List;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.utils
 * @fileName OkGoUtils
 * @date 2018/10/25 11:23
 * @org www.offcn.com
 * @email
 * @description
 */
public class OkGoUtils {
    public static void okGoPost(String url){
        OkGo.<String>post(url)
                .execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {

            }
        });
    }

    public static void okGoGet(String url, final CallBack<List<ResultBean>> callBack){
        HttpParams httpParams = new HttpParams();
//        httpParams.put();
        OkGo.<String>get(url)
                .params(httpParams)
                .execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
//                callBack.onSuccess();
            }
        });
    }
}
