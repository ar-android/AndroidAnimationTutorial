package com.ahmadrosid.androidanimtaion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by ocittwo on 11/4/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class BaseActivity extends AppCompatActivity{
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    protected void open(Class clazz){
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}