package me.maweiyi;

/**
 * Created by maweiyi on 9/29/16.
 */
public class MailSender implements Sender {
    @Override
    public void sender() {
        System.out.println("This is mailSender!");
    }
}
