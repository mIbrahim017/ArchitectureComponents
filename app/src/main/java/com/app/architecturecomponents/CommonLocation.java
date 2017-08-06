package com.app.architecturecomponents;

/**
 * Created by mohamed ibrahim on 8/3/2017.
 */

public class CommonLocation {
    public final double latitude;
    public final float accuracy;
    public double longitude;

    public CommonLocation(double longitude, double latitude, float accuracy) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.accuracy = accuracy;
    }


}
