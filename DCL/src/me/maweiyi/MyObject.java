package me.maweiyi;

/**
 * Created by maweiyi on 9/20/16.
 */
public class MyObject {
    private volatile static MyObject myObject;
    private MyObject() {

    }

    public static MyObject getInstance() {
        try {
            if (myObject != null) {

            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return myObject;
    }
}
