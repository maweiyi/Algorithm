package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
