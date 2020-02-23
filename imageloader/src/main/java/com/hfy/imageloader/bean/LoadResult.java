package com.hfy.imageloader.bean;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * 加载结果
 * @author hufeiyang
 */
public class LoadResult {

    public Bitmap bitmap;

    /**
     * bitmap对应的url
     */
    public String url;

    public ImageView imageView;


    public LoadResult(Bitmap bitmap, String url, ImageView imageView) {
        this.bitmap = bitmap;
        this.url = url;
        this.imageView = imageView;
    }
}
