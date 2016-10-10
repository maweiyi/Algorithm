package me.maweiyi;

/**
 * Created by maweiyi on 10/10/16.
 */
public class MyBridge extends Bridge {

    public void method() {
        getSource().method();
    }
}
