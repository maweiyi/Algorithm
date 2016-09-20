package me.maweiyi;

/**
 * Created by maweiyi on 9/20/16.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
