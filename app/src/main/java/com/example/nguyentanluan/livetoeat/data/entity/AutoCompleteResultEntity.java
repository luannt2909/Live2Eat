package com.example.nguyentanluan.livetoeat.data.entity;

import com.example.nguyentanluan.livetoeat.data.entity.common.BaseMapApiEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public class AutoCompleteResultEntity extends BaseMapApiEntity{
    @SerializedName("predictions")
    public Prediction[] predictions;

    public class Prediction {

        @SerializedName("description")
        public String description;

        @SerializedName("place_id")
        public String placeId;
    }
}
