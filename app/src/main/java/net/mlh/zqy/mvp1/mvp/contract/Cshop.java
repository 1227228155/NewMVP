package net.mlh.zqy.mvp1.mvp.contract;


import net.mlh.zqy.mvp1.bean.BookBean;
import net.mlh.zqy.mvp1.mvp.base.IBaseModel;
import net.mlh.zqy.mvp1.mvp.base.IBasePresenter;
import net.mlh.zqy.mvp1.mvp.base.IBaseView;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public interface Cshop {

    interface IPshop extends IBasePresenter {
       void getList();
       void getBook();
    }

    interface IVshop extends IBaseView {
       void showAdapter(List<String> strings);
       void showBook(BookBean bookBean);
    }
    interface IMshop extends IBaseModel {
        Observable<BookBean> getBook();
    }
}