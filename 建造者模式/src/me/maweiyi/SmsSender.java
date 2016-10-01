package me.maweiyi;

/**
 * Created by maweiyi on 9/27/16.
 */
public class SmsSender implements Sender {
    @Override
    public void sender() {
        System.out.println("This is a smsSender!");
    }
}
