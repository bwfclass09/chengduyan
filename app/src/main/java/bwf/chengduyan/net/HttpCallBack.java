package bwf.chengduyan.net;

import com.zhy.http.okhttp.callback.StringCallback;

import java.lang.reflect.ParameterizedType;

import bwf.chengduyan.utils.LogUtils;
import bwf.chengduyan.utils.StringUtils;
import okhttp3.Call;

/**
 * Created by Lizhangfeng on 2016/8/16 0016.
 * Description: http回调
 */
public abstract class HttpCallBack<T> extends StringCallback {

    private Class<T> tClass;

    public HttpCallBack() {
        tClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public void onError(Call call, Exception e, int id) {
        onFail("网络异常");
    }

    @Override
    public void onResponse(String response, int id) {

        if (StringUtils.isNotEmpty(response)) {

            LogUtils.e("服务器返回结果: " + response);

//            try {
//
//                BaseBean baseBean = JSON.parseObject(response, BaseBean.class);
//
//                if ("10000".equals(baseBean.code)) {
//
//                    if (StringUtils.isNotEmpty(baseBean.result))
//
//                        onSuccess(JSON.parseObject(baseBean.result, tClass));
//                    else
//                        onFail("result is empty");
//
//                } else {
//                    onFail(baseBean.msg);
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//                onFail("解析异常");
//            }

        } else
            onFail("服务器返回内容为空");

    }

    public abstract void onSuccess(T result);

    public abstract void onFail(String errMsg);

}