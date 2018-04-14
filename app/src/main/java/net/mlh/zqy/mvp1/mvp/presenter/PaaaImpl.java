package net.mlh.zqy.mvp1.mvp.presenter;

import android.content.Context;

import net.mlh.zqy.mvp1.mvp.contract.Caaa;
import net.mlh.zqy.mvp1.mvp.model.MaaaImpl;
import net.mlh.zqy.mvp1.mvp.base.BasePresenter;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PaaaImpl extends BasePresenter<Caaa.IVaaa, MaaaImpl> implements Caaa.IPaaa {


    public PaaaImpl(Context mContext, Caaa.IVaaa mView) {
        super(mContext, mView, new MaaaImpl());
    }

}
