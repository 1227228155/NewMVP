package net.mlh.zqy.mvp1.base;


import net.mlh.zqy.mvp1.api.DevMvpApi;
import net.mlh.zqy.mvp1.api.DevMvpService;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Liang_Lu on 2017/12/21.
 */

public abstract class BaseModel {


    public CompositeDisposable mDisposable = new CompositeDisposable();

    /**
     * 初始化调用网络请求
     * @return
     */
    public DevMvpService apiService() {
        return DevMvpApi.createApi().create(DevMvpService.class);
    }
    /**
     * 取消网络请求
     */
    public void onDestroy() {

        if (mDisposable != null) {
            mDisposable.isDisposed();
            mDisposable.clear();
        }
    }
}
