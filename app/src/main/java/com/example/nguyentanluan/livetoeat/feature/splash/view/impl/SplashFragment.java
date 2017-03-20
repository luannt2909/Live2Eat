package com.example.nguyentanluan.livetoeat.feature.splash.view.impl;

import android.os.CountDownTimer;
import android.widget.ImageView;

import com.example.nguyentanluan.livetoeat.R;
import com.example.nguyentanluan.livetoeat.feature.base.impl.BaseFragment;
import com.example.nguyentanluan.livetoeat.feature.signup.view.impl.SignUpActivity_;
import com.example.nguyentanluan.livetoeat.feature.splash.presenter.SplashPresenter;
import com.example.nguyentanluan.livetoeat.feature.splash.view.SplashView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */
@EFragment(R.layout.fragment_splash)
public class SplashFragment<P extends SplashPresenter>
        extends BaseFragment implements SplashView {
    @ViewById(R.id.imglogo)
    ImageView img;

    @AfterViews
    void goToHome(){
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                SignUpActivity_.intent(getContext()).start();
            }
        }.start();
    }
}
