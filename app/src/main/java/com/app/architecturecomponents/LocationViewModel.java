package com.app.architecturecomponents;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

/**
 * Created by mohamed ibrahim on 8/7/2017.
 */

public class LocationViewModel extends ViewModel {
    private LiveData<CommonLocation> locationLiveData = null;

    LiveData<CommonLocation> getLocation(Context context) {
        if (locationLiveData == null) {
            locationLiveData = new LocationLiveData(context);
        }
        return locationLiveData;
    }

}
