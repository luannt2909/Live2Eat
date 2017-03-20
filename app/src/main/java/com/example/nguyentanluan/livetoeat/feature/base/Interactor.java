package com.example.nguyentanluan.livetoeat.feature.base;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public interface Interactor {

    interface InteractorCallback<T>{
        void onSuccess(T data);
        void onError(Throwable error);
    }
}
