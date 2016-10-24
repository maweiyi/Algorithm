package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
