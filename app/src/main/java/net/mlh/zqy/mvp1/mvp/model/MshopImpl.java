package net.mlh.zqy.mvp1.mvp.model;


import android.util.Log;

import net.mlh.zqy.mvp1.api.NetDao;
import net.mlh.zqy.mvp1.bean.BookBean;
import net.mlh.zqy.mvp1.mvp.base.BaseModel;
import net.mlh.zqy.mvp1.mvp.contract.Cshop;
import net.mlh.zqy.mvp1.mvp.rx.Rxschedulers;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class MshopImpl extends BaseModel implements Cshop.IMshop {
    List<String> stringList = new ArrayList<>();

    public List<String> getStringList() {
        for (int i = 0; i < 20; i++) {
            stringList.add("第"+i+"个");
        }
        return stringList;
    }


    @Override
    public Observable<BookBean> getBook() {
        Log.e("z走了getBook方法","111111111111111");
        return NetDao.getInstance().getCommonApi().bookClassify().compose(Rxschedulers.<BookBean>io_main());
    }
}
