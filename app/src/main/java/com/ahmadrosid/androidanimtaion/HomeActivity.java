package com.ahmadrosid.androidanimtaion;

import android.os.Bundle;

import com.ahmadrosid.androidanimtaion.animactivity.ActivityTransition;
import com.ahmadrosid.androidanimtaion.animfragment.FragmentMainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.basic) void clickBasic(){
        open(BasicAnimations.class);
    }

    @OnClick(R.id.property) void clickProperty(){
        open(PropertyAnimations.class);
    }

    @OnClick(R.id.layout_transition) void clickLayouty(){
        open(LayoutTransitionActivity.class);
    }

    @OnClick(R.id.activity_transition) void clickActivity(){
        open(ActivityTransition.class);
    }
    @OnClick(R.id.fragment_transition) void clickFragment(){
        open(FragmentMainActivity.class);
    }
}
