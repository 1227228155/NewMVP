package net.mlh.zqy.mvp1.mvp.presenter;

import android.content.Context;

import net.mlh.zqy.mvp1.mvp.contract.Czqww;
import net.mlh.zqy.mvp1.mvp.model.MzqwwImpl;
import net.mlh.zqy.mvp1.mvp.base.BasePresenter;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PzqwwImpl extends BasePresenter<Czqww.IVzqww, MzqwwImpl> implements Czqww.IPzqww {


    public PzqwwImpl(Context mContext, Czqww.IVzqww mView) {
        super(mContext, mView, new MzqwwImpl());
    }

}
