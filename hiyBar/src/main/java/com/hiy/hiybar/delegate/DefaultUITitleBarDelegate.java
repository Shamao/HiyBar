package com.hiy.hiybar.delegate;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import android.view.View;

import com.hiy.hiybar.R;
import com.hiy.hiybar.UITitleBar;
import com.hiy.hiybar.provider.DividerViewProvider;
import com.hiy.hiybar.provider.ImageViewProvider;
import com.hiy.hiybar.provider.TitleViewProvider;


public class DefaultUITitleBarDelegate {


    public ImageViewProvider bindLeftBack(Context context, UITitleBar titleBar, final View.OnClickListener listener) {
        ImageViewProvider provider = new ImageViewProvider(context);
        provider.setImageResource(R.drawable.ic_back);
        float density = context.getResources().getDisplayMetrics().density;
//        provider.setMarginLeft((int) (density * 12));
        int size = (int) (density * 48);
        provider.setSize(new Size(size, size));
        titleBar.bindLeftViewProvider(provider);
        provider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(v);
                }
            }
        });
        return provider;
    }

    public TitleViewProvider bindTitle(Context context, UITitleBar titleBar, String title) {
        TitleViewProvider provider = new TitleViewProvider(context);
        provider.setText(title);
        titleBar.bindCenterViewProvider(provider);
        return provider;
    }

    public ImageViewProvider bindRightImage(Context context, UITitleBar titleBar, int resId, final View.OnClickListener listener) {
        ImageViewProvider provider = new ImageViewProvider(context);
        provider.setImageResource(resId);
        titleBar.bindRightViewProvider(provider);
        provider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(v);
                }
            }
        });
        return provider;
    }

    public DividerViewProvider bindDivider(Context context, UITitleBar titleBar) {
        DividerViewProvider provider = new DividerViewProvider(context);
        titleBar.bindBottomViewProvider(provider);
        return provider;
    }
}
