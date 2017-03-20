package com.example.nguyentanluan.livetoeat.feature.base.impl;

import com.example.nguyentanluan.livetoeat.feature.base.Navigator;
import com.example.nguyentanluan.livetoeat.feature.base.PView;
import com.example.nguyentanluan.livetoeat.feature.base.Presenter;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public  class BaseFragment<P extends Presenter>
        extends MainFragment implements PView,Navigator{


    @Override
    public void showDialog(String title, String message, ViewDialogAction leftAction, ViewDialogAction rightAction) {

    }

    @Override
    public void showToast(String message) {

    }

    @Override
    public void hideKeyboard() {

    }

    @Override
    public void goToSignUp() {

    }
}
