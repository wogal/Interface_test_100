package com.egs.wogal.interface_test_100;

/**
 * Created by wogal on 6/21/2017.
 */

public class ImageButton {

    private OnWidgetClickListerner onWidgetClickListerner;



    public void setOnWidgetClickListerner (OnWidgetClickListerner onWidgetClickListerner) {
        this.onWidgetClickListerner = onWidgetClickListerner;
    }

    private void OnClick () {
        onWidgetClickListerner.onClick( getViewId() );

    }


    public int getViewId () {
        return 123456;
    }

}
