package me.maweiyi;

/**
 * Created by maweiyi on 9/18/16.
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
