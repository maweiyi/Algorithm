package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(r);
        pThread.start();
        cThread.start();
    }
}
