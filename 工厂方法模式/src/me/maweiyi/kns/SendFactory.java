package me.maweiyi.kns;

import me.maweiyi.MailSender;
import me.maweiyi.Sender;
import me.maweiyi.SmsSender;

/**
 * Created by maweiyi on 9/27/16.
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
