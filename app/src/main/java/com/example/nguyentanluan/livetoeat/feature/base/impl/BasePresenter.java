package com.example.nguyentanluan.livetoeat.feature.base.impl;

import com.example.nguyentanluan.livetoeat.feature.base.Interactor;
import com.example.nguyentanluan.livetoeat.feature.base.Navigator;
import com.example.nguyentanluan.livetoeat.feature.base.PView;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */

public class BasePresenter <V extends PView,
        N extends Navigator,
        I extends Interactor>
        extends MainPresenter<V, N, I> {
}
