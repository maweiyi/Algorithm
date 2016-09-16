package me.maweiyi;

/**
 * Created by maweiyi on 9/16/16.
 */
public class Mythread2 extends Thread {
    private Object lock;
    public Mythread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始noify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束noify time=" + System.currentTimeMillis());
        }
    }
}
