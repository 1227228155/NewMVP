package net.mlh.zqy.mvp1.mvp.view.fragment;

import android.os.Bundle;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.mvp.base.BaseFragment;
import net.mlh.zqy.mvp1.mvp.contract.Cfollow;
import net.mlh.zqy.mvp1.mvp.presenter.PfollowImpl;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class followFragment extends BaseFragment<PfollowImpl> implements Cfollow.IVfollow {


    public static followFragment newInstance() {
        followFragment fragment = new followFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initView() {


    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_follow;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PfollowImpl(mContext, this);
    }

    @Override
    public void showLoading() {
    }

    @Override
    public void hideLoading() {
    }

}
