package me.maweiyi;

/**
 * Created by maweiyi on 9/17/16.
 */
public class MyThread extends Thread{
    private MyService service;
    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
