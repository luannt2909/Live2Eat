package com.example.nguyentanluan.livetoeat.data.entity.common;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public class BaseSingleEntity<T> extends BaseResponse {
    @SerializedName("Dto")
    public T data;
}
