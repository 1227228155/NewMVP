package net.mlh.zqy.mvp1.mvp.presenter;

import android.content.Context;

import net.mlh.zqy.mvp1.base.BasePresenter;
import net.mlh.zqy.mvp1.mvp.contract.Cshop;
import net.mlh.zqy.mvp1.mvp.model.MshopImpl;



/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PshopImpl extends BasePresenter<Cshop.IVshop, MshopImpl> implements Cshop.IPshop {


    public PshopImpl(Context mContext, Cshop.IVshop mView) {
        super(mContext, mView, new MshopImpl());
    }

}
