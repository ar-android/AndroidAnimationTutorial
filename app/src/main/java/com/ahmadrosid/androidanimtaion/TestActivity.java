package com.ahmadrosid.androidanimtaion;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {

    @BindView(R.id.btn_anim) Button btn_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_anim) void clickAnim() {
        Animator anim = AnimatorInflater.loadAnimator(this, R.animator.combo);
        anim.setTarget(btn_anim);
        anim.start();
    }

    private ObjectAnimator createFade(View view) {
        ObjectAnimator fadeAnimation = ObjectAnimator.ofFloat(view, View.ALPHA, 0);
        fadeAnimation.setRepeatCount(1);
        fadeAnimation.setRepeatMode(ValueAnimator.REVERSE);
        return fadeAnimation;
    }

    private ObjectAnimator createMove(View view) {
        int deltaY = 5 - view.getHeight();
        ObjectAnimator translateAnimation = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, deltaY);
        translateAnimation.setRepeatCount(1);
        translateAnimation.setRepeatMode(ValueAnimator.REVERSE);
        return translateAnimation;
    }

    private ObjectAnimator createZoom(View view) {
        PropertyValuesHolder phx = PropertyValuesHolder.ofFloat(View.SCALE_X, 2);
        PropertyValuesHolder phy = PropertyValuesHolder.ofFloat(View.SCALE_Y, 2);
        ObjectAnimator scaleAnimation = ObjectAnimator.ofPropertyValuesHolder(view, phx, phy);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setRepeatMode(ValueAnimator.REVERSE);
        scaleAnimation.setDuration(1500);
        return scaleAnimation;
    }

    private ObjectAnimator createSpin(View view) {
        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(view, View.ROTATION, 360);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setRepeatMode(ValueAnimator.REVERSE);
        rotateAnimation.setDuration(600);
        return rotateAnimation;
    }
}
