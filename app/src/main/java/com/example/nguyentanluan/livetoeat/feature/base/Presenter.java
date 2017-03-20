package com.example.nguyentanluan.livetoeat.feature.base;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public interface Presenter<V,N> {
    void setView(V view);
    void setNavigator(N navigator);
    V getView();
    N getNavigator();
}
