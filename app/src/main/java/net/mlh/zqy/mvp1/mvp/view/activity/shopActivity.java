package net.mlh.zqy.mvp1.mvp.view.activity;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.base.BaseActivity;
import net.mlh.zqy.mvp1.mvp.contract.Cshop;
import net.mlh.zqy.mvp1.mvp.presenter.PshopImpl;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class shopActivity extends BaseActivity<PshopImpl> implements Cshop.IVshop {


    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_shop;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PshopImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
