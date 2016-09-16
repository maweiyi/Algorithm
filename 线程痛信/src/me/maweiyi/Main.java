package me.maweiyi;

public class Main {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            Mythread1 t1 = new Mythread1(lock);
            t1.start();
            Thread.sleep(3000);
            Mythread2 t2 = new Mythread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
