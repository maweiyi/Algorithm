package me.maweiyi;

/**
 * Created by maweiyi on 9/16/16.
 */
public class ThreadC extends Thread {
    private C r;

    public ThreadC(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}
