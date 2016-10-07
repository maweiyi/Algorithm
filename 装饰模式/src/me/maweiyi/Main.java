package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
