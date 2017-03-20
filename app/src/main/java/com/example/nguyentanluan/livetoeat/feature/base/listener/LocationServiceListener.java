package com.example.nguyentanluan.livetoeat.feature.base.listener;

import android.location.Location;
import android.os.Bundle;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public interface LocationServiceListener {
    void onLocationChanged(Location location);
    void onStatusChanged(String provider, int status, Bundle extras);
    void onProviderEnabled(String provider);
    void onProviderDisabled(String provider);
}
