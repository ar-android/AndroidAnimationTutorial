package com.ahmadrosid.androidanimtaion.animfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.ahmadrosid.androidanimtaion.BaseActivity;
import com.ahmadrosid.androidanimtaion.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ocittwo on 11/4/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class FragmentMainActivity extends BaseActivity{

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.one) void one(){
        setFragmentAnimation(new FragmentOne());
    }

    @OnClick(R.id.two) void two(){
        setFragmentAnimation(new FragmentTwo());
    }

    private void setFragmentAnimation(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.enter_anim, R.anim.close_anim)
                .replace(R.id.container, fragment)
                .commit();
    }
}
