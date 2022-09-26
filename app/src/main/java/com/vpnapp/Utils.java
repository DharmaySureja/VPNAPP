package com.vpnapp;

import android.net.Uri;

import com.vpnapp.R;

public class Utils {

    //Convert drawable image resource to string
     //resourceId drawable image resource

    public static String getImgURL(int resourceId) {

        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }
}
