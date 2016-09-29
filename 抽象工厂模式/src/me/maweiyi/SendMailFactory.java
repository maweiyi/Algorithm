package me.maweiyi;

/**
 * Created by maweiyi on 9/29/16.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
