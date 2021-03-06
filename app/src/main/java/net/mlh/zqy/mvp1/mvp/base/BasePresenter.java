package net.mlh.zqy.mvp1.mvp.base;


import android.content.Context;

import net.mlh.zqy.mvp1.mvp.rx.RxManager;

/**
 * Created by Liang_Lu on 2017/12/23.
 */
public class BasePresenter<V extends IBaseView, M extends BaseModel> {
    protected V mView;
    protected M mModel;
    protected Context mContext;
    public RxManager mRxmanager = new RxManager();
    public BasePresenter(Context mContext, V mView, M mModel) {
        this.mView = mView;
        this.mModel = mModel;
        this.mContext = mContext;
    }

    public void onDestroy() {
        mView = null;
        mModel = null;
        mRxmanager.clear();
    }



}
