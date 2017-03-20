package com.example.nguyentanluan.livetoeat.feature.base.impl;

import com.example.nguyentanluan.livetoeat.feature.base.Interactor;
import com.example.nguyentanluan.livetoeat.feature.base.Navigator;
import com.example.nguyentanluan.livetoeat.feature.base.PView;
import com.example.nguyentanluan.livetoeat.feature.base.Presenter;
import com.example.nguyentanluan.livetoeat.service.ResourcesService;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public class MainPresenter<V extends PView,
        N extends Navigator,
        I extends Interactor>
        implements Presenter<V, N> {

    protected ResourcesService mResourceService;
    protected V mView;
    protected N mNavigator;
    protected I mInteractor;

    @Override
    public void setView(V view) {

    }

    @Override
    public void setNavigator(N navigator) {

    }

    @Override
    public V getView() {
        return null;
    }

    @Override
    public N getNavigator() {
        return null;
    }
}
