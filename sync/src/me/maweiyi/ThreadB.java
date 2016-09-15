package me.maweiyi;

/**
 * Created by maweiyi on 9/15/16.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        //super.run();
        service.setUsernamePassword("b", "bb");

    }
}