package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
