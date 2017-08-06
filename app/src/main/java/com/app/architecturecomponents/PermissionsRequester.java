package com.app.architecturecomponents;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 * Created by mohamed ibrahim on 8/6/2017.
 */

public class PermissionsRequester {

    private static final String[] PERMISSIONS = {
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION
    };

    public  static  boolean hasPermission(Activity context){
        if (context != null) {
            for (String permission : PERMISSIONS) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;

    }

    public  static void requestPermissions(Activity activity){
        if (activity == null) return ;
        ActivityCompat.requestPermissions(activity, PERMISSIONS, 0);
    }
}
