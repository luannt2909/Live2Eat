package com.example.nguyentanluan.livetoeat.service;

import com.example.nguyentanluan.livetoeat.feature.base.listener.LocationServiceListener;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public interface LocationService {
    void requestLocation(boolean isRepeatReceiveLocation);
    boolean isGpsEnable();
    boolean canAccessLocation();
    boolean isDenied();
    void setListener(LocationServiceListener listener);
}
