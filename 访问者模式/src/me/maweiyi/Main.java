package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
