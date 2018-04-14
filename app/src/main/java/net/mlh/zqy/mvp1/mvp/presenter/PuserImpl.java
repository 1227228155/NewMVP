package net.mlh.zqy.mvp1.mvp.presenter;

import android.content.Context;

import net.mlh.zqy.mvp1.mvp.base.BasePresenter;
import net.mlh.zqy.mvp1.mvp.contract.Cuser;
import net.mlh.zqy.mvp1.mvp.model.MuserImpl;



/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PuserImpl extends BasePresenter<Cuser.IVuser, MuserImpl> implements Cuser.IPuser {


    public PuserImpl(Context mContext, Cuser.IVuser mView) {
        super(mContext, mView, new MuserImpl());
    }

}
