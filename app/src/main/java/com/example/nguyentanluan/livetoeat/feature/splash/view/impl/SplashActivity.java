package com.example.nguyentanluan.livetoeat.feature.splash.view.impl;

import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.nguyentanluan.livetoeat.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Nguyen Tan Luan on 3/19/2017.
 */
@EActivity(R.layout.activity_splash)
public class SplashActivity extends AppCompatActivity {

    protected SplashFragment mSplashFragment;
    @ViewById(R.id.container1)
    FrameLayout framelayout;
    @ViewById(R.id.imglogo)
    ImageView imglogo;
    @AfterViews
    void setLogo(){
        //imglogo.setImageResource(R.drawable.logouit);
        mSplashFragment=getSplashFragment();
        InitView();
    }


    void InitView(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container1,mSplashFragment).addToBackStack(null).commit();
    }

    private SplashFragment getSplashFragment() {
        return new SplashFragment_();
    }
}
