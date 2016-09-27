package me.maweiyi.knt;

import me.maweiyi.MailSender;
import me.maweiyi.Sender;
import me.maweiyi.SmsSender;

/**
 * Created by maweiyi on 9/27/16.
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
