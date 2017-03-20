package com.example.nguyentanluan.livetoeat.feature.base;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public interface PView {
    void showDialog(String title, String message, ViewDialogAction leftAction, ViewDialogAction rightAction);
    void showToast(String message);
    void hideKeyboard();
    public interface ViewDialogAction{
        String getTitle();
        void onClick();
    }
}
