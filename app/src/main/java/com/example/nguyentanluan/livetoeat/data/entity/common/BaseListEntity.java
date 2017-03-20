package com.example.nguyentanluan.livetoeat.data.entity.common;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public class BaseListEntity<T> extends BaseResponse {
    @SerializedName("Dtos")
    public ArrayList<T> data;
}
