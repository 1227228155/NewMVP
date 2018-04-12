package net.mlh.zqy.mvp1.mvp.view.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import net.mlh.zqy.mvp1.R;
import net.mlh.zqy.mvp1.adapter.BaseRecyclerAdapter;
import net.mlh.zqy.mvp1.base.BaseActivity;
import net.mlh.zqy.mvp1.mvp.contract.Cshop;
import net.mlh.zqy.mvp1.mvp.presenter.PshopImpl;
import net.mlh.zqy.mvp1.mvp.view.activity.adapter.shopAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class shopActivity extends BaseActivity<PshopImpl> implements Cshop.IVshop,BaseRecyclerAdapter.OnItemClickListener,
        BaseRecyclerAdapter.OnItemLongClickListener{
    shopAdapter adapter;
    List<String> stringList = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void initView() {
        super.initView();
        recyclerView = findViewById(R.id.shop_recycler);
        mPresenter.getList();
    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_shop;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PshopImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    //adapter点击事件
    @Override
    public void onItemClick(View itemView, int pos) {
        Toast.makeText(mContext, "adapter被点击了第"+pos+"个", Toast.LENGTH_SHORT).show();
    }

    //adapter长按事件
    @Override
    public void onItemLongClick(View itemView, int pos) {
        Toast.makeText(mContext, "adapter被长按了第"+pos+"个", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAdapter(List<String> strings) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new shopAdapter(this,strings);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
        adapter.setOnItemLongClickListener(this);
    }
}
