package com.example.pagertab.ui.Utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

import com.example.pagertab.Global.MyApplication;

/**
 * Created by orchid on 16-10-7.
 */
public class UIUtils {

    public static Context getContext(){
        return MyApplication.getContext();
    }

    public static int dip2px(float dip) {
        float dentisy = getContext().getResources().getDisplayMetrics().density;
        return (int) (dip * dentisy + 0.5f);
    }

    public static ColorStateList getColorStateList(int id) {
        return getContext().getResources().getColorStateList(id);
    }


    public static Drawable getDrawable(int id) {
        return getContext().getResources().getDrawable(id);
    }
}
