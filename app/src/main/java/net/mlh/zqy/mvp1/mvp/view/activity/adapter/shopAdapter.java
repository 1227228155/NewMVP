package net.mlh.zqy.mvp1.mvp.view.activity.adapter;

import android.content.Context;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.adapter.BaseRecyclerAdapter;
import net.mlh.zqy.mvp1.adapter.RecyclerViewHolder;

import java.util.List;

/**
 * Created by 1227228155@qq.com on 2018/4/11.
 */

public class shopAdapter extends BaseRecyclerAdapter {
    List<String> stringList;
    public shopAdapter(Context ctx, List list) {
        super(ctx, list);
        stringList = list;
    }

    @Override
    public int getItemLayoutId(int viewType) {
        if (viewType==0){
            return R.layout.item_shop;
        }
        return R.layout.item_shop2;
    }

    @Override
    public int getItemViewType(int position) {
        int type;
        if (position%2==0){
            type =  0;
        }else {
            type = 1;
        }
        return type;
    }

    @Override
    public void bindData(RecyclerViewHolder holder, int position, Object item) {
        if (holder.getItemViewType()==0){
            holder.getTextView(R.id.item_tv0).setText(stringList.get(position));
        }else {
            holder.getTextView(R.id.item_tv1).setText(stringList.get(position));
            holder.getTextView(R.id.item_tv2).setText(stringList.get(position));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
            bindData(holder,position,position);
    }
}
