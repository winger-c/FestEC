package com.example.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.example.latte.app.Latte;

/**
 * Created by W on 2018/10/24.
 */

public class DimenUtil {

    public static int getScreenWidth() {//得到屏幕的宽
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {//得到屏幕的高
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
