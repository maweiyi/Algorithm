package me.maweiyi.knt;

import me.maweiyi.Sender;

/**
 * Created by maweiyi on 9/27/16.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.sender();
    }
}
