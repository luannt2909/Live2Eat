package com.example.nguyentanluan.livetoeat.service;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public interface ResourcesService {
    String getString(String key);
    String getString(String key, Object... args);

}
