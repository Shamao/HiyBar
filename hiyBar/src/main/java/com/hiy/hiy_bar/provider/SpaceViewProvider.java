package com.hiy.hiy_bar.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Space;

/**
 * Space 样式
 * @author lsd
 * @date 2019/4/5.
 */
@SuppressLint("AppCompatCustomView")
public class SpaceViewProvider extends IViewProvider<Space> {

    public SpaceViewProvider(Context context) {
        super(context);
    }

    @Override
    Space onCreateView(Context context) {
        Space space = new Space(context);
        return space;
    }
}
