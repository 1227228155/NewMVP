package net.mlh.zqy.mvp1.mvp.view.activity;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.mvp.base.BaseActivity;
import net.mlh.zqy.mvp1.mvp.contract.Cuser;
import net.mlh.zqy.mvp1.mvp.presenter.PuserImpl;

import android.os.Bundle;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class userActivity extends BaseActivity<PuserImpl> implements Cuser.IVuser {


    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_user;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PuserImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
