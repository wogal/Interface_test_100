package com.egs.wogal.interface_test_100;

import android.os.Bundle;

/**
 * Created by wogal on 6/21/2017.
 */

public class Fragment extends android.app.Fragment implements OnWidgetClickListerner {


    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        ButtonTwo button = new ButtonTwo();
        button.setOnWidgetClickListerner( this );
    }


    @Override
    public void onClick (int viewId) {

    }


}
