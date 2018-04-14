package net.mlh.zqy.mvp1.mvp.view.activity;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.mvp.base.BaseActivity;
import net.mlh.zqy.mvp1.mvp.contract.Czqww;
import net.mlh.zqy.mvp1.mvp.presenter.PzqwwImpl;

import android.os.Bundle;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class zqwwActivity extends BaseActivity<PzqwwImpl> implements Czqww.IVzqww {


    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    protected void initListener() {

    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_zqww;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PzqwwImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
