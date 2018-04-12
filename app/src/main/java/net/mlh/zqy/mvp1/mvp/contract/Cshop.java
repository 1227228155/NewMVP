package net.mlh.zqy.mvp1.mvp.contract;


import net.mlh.zqy.mvp1.base.IBasePresenter;
import net.mlh.zqy.mvp1.base.IBaseView;

import java.util.List;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public interface Cshop {

    interface IPshop extends IBasePresenter {
       void getList();
    }

    interface IVshop extends IBaseView {
       void showAdapter(List<String> strings);
    }
}