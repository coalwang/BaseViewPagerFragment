package com.example.cola.baseviewpagerfragment;

import android.support.v4.app.Fragment;

/**
 * Created by Cola on 2017/5/26.
 */

public class MyFragment extends BasePagerFragment {

    @Override
    protected void addPageToAdapter(ViewPagerAdapter adapter) {
        String[] tittles = new String[]{"1","2","3","4"};
        //然后这里写自己的Fragment
        for(int i=0;i<tittles.length;i++){
            adapter.addPage(tittles[i],new Fragment());
        }

    }
}
