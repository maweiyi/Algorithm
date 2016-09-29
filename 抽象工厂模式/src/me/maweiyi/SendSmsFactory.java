package me.maweiyi;

/**
 * Created by maweiyi on 9/29/16.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
