package net.mlh.zqy.mvp1.mvp.view.activity;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.mvp.base.BaseActivity;
import net.mlh.zqy.mvp1.mvp.contract.Cqwer;
import net.mlh.zqy.mvp1.mvp.presenter.PqwerImpl;

import android.os.Bundle;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class qwerActivity extends BaseActivity<PqwerImpl> implements Cqwer.IVqwer {


    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_qwer;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PqwerImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
