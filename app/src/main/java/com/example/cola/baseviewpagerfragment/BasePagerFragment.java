package com.example.cola.baseviewpagerfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pagertab.ui.View.PagerTab;

/**
 * Created by Cola on 2017/5/26.
 */

public abstract class  BasePagerFragment extends Fragment {

    protected PagerTab myPagerTab;
    protected ViewPager myViewPager;
    protected ViewPagerAdapter adapter;

    /**
     * 创建Fragment中的布局的时候调用该方法
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(),R.layout.base_pager_fragment,null);
        myPagerTab = (PagerTab)view.findViewById(R.id.pager_tab);
        myViewPager = (ViewPager)view.findViewById(R.id.view_pager);
        return view;
    }

    /**
     * 创建Fragment中布局结束的时候调用该方法
     * 在该方法中绑定Adapter
     * 第一个参数view就是上面的onCreateView（）方法中返回的view
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        adapter = new ViewPagerAdapter(getFragmentManager());

        //给adapter添加page
        addPageToAdapter(adapter);

        //给ViewPager设置适配器
        myViewPager.setAdapter(adapter);
        //将PagerTab和ViewPager绑定在一起
        myPagerTab.setViewPager(myViewPager);

        setScreenPageLimit(myViewPager);
    }

    /**
     * 设置ViewPager的缓存页数，默认缓存3页
     * 子类可以重写该方法
     */
    protected void setScreenPageLimit(ViewPager viewPager){
        viewPager.setOffscreenPageLimit(viewPager.getAdapter().getCount()-1);
    }

    /**
     * 留给子类去添加page
     */
    protected abstract void addPageToAdapter(ViewPagerAdapter adapter);
}
