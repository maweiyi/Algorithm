package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.sender();
    }
}
