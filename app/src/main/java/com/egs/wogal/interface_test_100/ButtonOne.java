package com.egs.wogal.interface_test_100;

/**
 * Created by wogal on 6/21/2017.
 */

public class ButtonOne {
    private MainActivityOne mainActivityOne;

    public void setMainActivityOne (MainActivityOne mainActivityOne) {
        this.mainActivityOne = mainActivityOne;
    }

    public ButtonOne(){
        mainActivityOne.onClick(getViewId());
    }

    public Object getViewId () {
        return 123456;
    }
}
