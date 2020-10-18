package com.hiy.hiybar.provider;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * @author lsd
 * @date 2019/5/11.
 */
public class ImageViewProvider extends IViewProvider<ImageView> {

    public ImageViewProvider(Context context) {
        super(context);
    }


    @Override
    ImageView onCreateView(Context context) {
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(lp);

        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return imageView;
    }

    public void setImageBitmap(Bitmap bitmap) {
        view.setImageBitmap(bitmap);
    }


    public void setImageResource(int resId) {
        view.setImageResource(resId);
    }

    public void setMarginLeft(int marginLeft) {
        View view = getView();
        if (view != null) {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();
            lp.leftMargin = marginLeft;
            view.setLayoutParams(lp);
        }
    }

    public void setSize(Size size) {
        if (size == null) {
            return;
        }

        View view = getView();
        if (view != null) {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();
            lp.width = size.getWidth();
            lp.height = size.getHeight();
            view.setLayoutParams(lp);
        }
    }

}
