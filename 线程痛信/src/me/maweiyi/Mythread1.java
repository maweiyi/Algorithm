package me.maweiyi;

/**
 * Created by maweiyi on 9/16/16.
 */
public class Mythread1 extends Thread {

    private Object lock;
    public Mythread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始 wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
