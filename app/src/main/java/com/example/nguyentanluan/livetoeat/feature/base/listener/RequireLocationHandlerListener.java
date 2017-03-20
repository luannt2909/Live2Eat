package com.example.nguyentanluan.livetoeat.feature.base.listener;

import com.example.nguyentanluan.livetoeat.feature.base.PView;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public interface RequireLocationHandlerListener {
    void showDialog(String title, String message, PView.ViewDialogAction leftAction, PView.ViewDialogAction rightAction);
    void dismissDialog();
    void askPermissionLocation();
    void openGPSSetting();
    void openLocationSetting();
}
