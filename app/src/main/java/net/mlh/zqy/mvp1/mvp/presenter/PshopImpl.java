package net.mlh.zqy.mvp1.mvp.presenter;

import android.content.Context;

import net.mlh.zqy.mvp1.bean.BookBean;
import net.mlh.zqy.mvp1.mvp.base.BasePresenter;
import net.mlh.zqy.mvp1.mvp.contract.Cshop;
import net.mlh.zqy.mvp1.mvp.model.MshopImpl;

import java.util.List;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PshopImpl extends BasePresenter<Cshop.IVshop, MshopImpl> implements Cshop.IPshop {
    List<String> stringList;

    public PshopImpl(Context mContext, Cshop.IVshop mView) {
        super(mContext, mView, new MshopImpl());
    }

    @Override
    public void getList() {
      stringList = mModel.getStringList();
      mView.showAdapter(stringList);
    }

    @Override
    public void getBook() {
        mRxmanager.add(mModel.getBook().subscribe(new Consumer<BookBean>() {
            @Override
            public void accept(BookBean bookBean) throws Exception {
                        mView.showBook(bookBean);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {

            }
        }, new Action() {
            @Override
            public void run() throws Exception {
            }
        }));
    }
}
