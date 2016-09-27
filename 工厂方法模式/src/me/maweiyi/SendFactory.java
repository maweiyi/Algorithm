package me.maweiyi;

/**
 * Created by maweiyi on 9/27/16.
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("NO!");
            return null;
        }
    }
}
