package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("salash box", sbox);


        Product p1 = manager.create("strong message");
        p1.use("Hello world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello world.");
        Product p3 = manager.create("salash box");
        p3.use("Hello world.");

    }
}
