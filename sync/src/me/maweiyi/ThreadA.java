package me.maweiyi;

/**
 * Created by maweiyi on 9/15/16.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        super();
        this.service = service;

    }

    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");
    }
}