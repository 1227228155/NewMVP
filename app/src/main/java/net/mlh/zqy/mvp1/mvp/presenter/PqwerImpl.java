package net.mlh.zqy.mvp1.mvp.presenter;

import android.content.Context;

import net.mlh.zqy.mvp1.mvp.contract.Cqwer;
import net.mlh.zqy.mvp1.mvp.model.MqwerImpl;
import net.mlh.zqy.mvp1.mvp.base.BasePresenter;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PqwerImpl extends BasePresenter<Cqwer.IVqwer, MqwerImpl> implements Cqwer.IPqwer {


    public PqwerImpl(Context mContext, Cqwer.IVqwer mView) {
        super(mContext, mView, new MqwerImpl());
    }

}
