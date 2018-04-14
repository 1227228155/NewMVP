package net.mlh.zqy.mvp1.mvp.view.activity;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.mvp.base.BaseActivity;
import net.mlh.zqy.mvp1.mvp.contract.Caaa;
import net.mlh.zqy.mvp1.mvp.presenter.PaaaImpl;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class aaaActivity extends BaseActivity<PaaaImpl> implements Caaa.IVaaa {


    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    protected void initListener() {

    }


    @Override
    public int setContentViewId() {
        return R.layout.activity_aaa;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PaaaImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
