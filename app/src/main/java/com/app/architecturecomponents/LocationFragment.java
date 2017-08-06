package com.app.architecturecomponents;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleFragment;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by mohamed ibrahim on 8/3/2017.
 */

public class LocationFragment extends LifecycleFragment implements LocationListener {

    private static final String FRACTIONAL_FORMAT = "%.4f";
    private static final String ACCURACY_FORMAT = "%.1fm";

    private TextView latitudeValue;
    private TextView longitudeValue;
    private TextView accuracyValue;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);



    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
