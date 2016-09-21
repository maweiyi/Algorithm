package me.maweiyi;

/**
 * Created by maweiyi on 9/17/16.
 */
public class ThreadBB extends Thread {

    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
