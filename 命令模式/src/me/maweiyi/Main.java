package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
