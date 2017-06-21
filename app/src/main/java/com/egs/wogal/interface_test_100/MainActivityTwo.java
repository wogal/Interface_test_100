package com.egs.wogal.interface_test_100;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity implements OnWidgetClickListerner{

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }


    @Override
    public void onClick (int viewId) {

    }
}
