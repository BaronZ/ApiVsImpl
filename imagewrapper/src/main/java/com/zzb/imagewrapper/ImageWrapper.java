package com.zzb.imagewrapper;

import android.content.Context;

import com.squareup.picasso.Picasso;

/**
 * Created by ZZB on 2017/8/10.
 */

public class ImageWrapper {


    public static void loadImage(Context context) {
        Picasso.with(context);
    }
}
