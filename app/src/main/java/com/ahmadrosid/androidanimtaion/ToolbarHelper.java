package com.ahmadrosid.androidanimtaion;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ocittwo on 11/4/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class ToolbarHelper {

    public static ToolbarHelper instance;
    private AppCompatActivity activity;

    public static ToolbarHelper getInstance() {
        instance = new ToolbarHelper();
        return instance;
    }

    public ToolbarHelper set(AppCompatActivity activity){
        this.activity = activity;
        return instance;
    }

    public ToolbarHelper setTitle(String title){
        instance.activity.getSupportActionBar().setTitle(title);
        return instance;
    }

    public ToolbarHelper setBack(){
        ActionBar ab = instance.activity.getSupportActionBar();
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);
        return instance;
    }
}
