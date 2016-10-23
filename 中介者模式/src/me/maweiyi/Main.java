package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
