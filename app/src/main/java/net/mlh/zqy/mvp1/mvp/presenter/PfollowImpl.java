package net.mlh.zqy.mvp1.mvp.presenter;

import android.content.Context;

import net.mlh.zqy.mvp1.mvp.base.BasePresenter;
import net.mlh.zqy.mvp1.mvp.contract.Cfollow;
import net.mlh.zqy.mvp1.mvp.model.MfollowImpl;



/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PfollowImpl extends BasePresenter<Cfollow.IVfollow, MfollowImpl> implements Cfollow.IPfollow {


    public PfollowImpl(Context mContext, Cfollow.IVfollow mView) {
        super(mContext, mView, new MfollowImpl());
    }

}
