package com.example.nguyentanluan.livetoeat.data.entity.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public class BaseResponse {
    @SerializedName("Message")
    public String message;
    @SerializedName("ResponseCode")
    public int responseCode;
}
