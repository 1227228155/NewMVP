package net.mlh.zqy.mvp1.mvp.model;


import net.mlh.zqy.mvp1.base.BaseModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class MshopImpl extends BaseModel {
    List<String> stringList = new ArrayList<>();

    public List<String> getStringList() {
        for (int i = 0; i < 20; i++) {
            stringList.add("第"+i+"个");
        }
        return stringList;
    }
}
