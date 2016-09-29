package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.sender();
    }
}
