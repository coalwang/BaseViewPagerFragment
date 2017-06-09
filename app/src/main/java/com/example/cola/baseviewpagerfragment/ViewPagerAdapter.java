package com.example.cola.baseviewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Cola on 2017/5/26.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<String> tittles;  //存放tittle
    private ArrayList<Fragment> fragments;  //用来存放fragment

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        tittles = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return tittles.size();
    }

    /**
     * 返回PagerTab对应位置的tittle
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return tittles.get(position);
    }

    public void addPage(String tittle, Fragment fragment){
        tittles.add(tittle);
        fragments.add(fragment);
    }
}
