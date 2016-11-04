package com.ahmadrosid.androidanimtaion.animactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ahmadrosid.androidanimtaion.BaseActivity;
import com.ahmadrosid.androidanimtaion.R;
import com.ahmadrosid.androidanimtaion.ToolbarHelper;

/**
 * Created by ocittwo on 11/4/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public class LastActivity extends BaseActivity{

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        ToolbarHelper.getInstance().set(this).setBack();
    }

    @Override public void finish() {
        super.finish();
        overridePendingTransition(R.anim.enter_anim, R.anim.close_anim);
    }
}
