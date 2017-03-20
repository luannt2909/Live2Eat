package com.example.nguyentanluan.livetoeat.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public class LocationEntity {
    @SerializedName("Longitude")
    public double longitude;
    @SerializedName("Latitude")
    public double latitude;
}
