package me.maweiyi.kns;

import me.maweiyi.Sender;

/**
 * Created by maweiyi on 9/27/16.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.sender();
    }
}
