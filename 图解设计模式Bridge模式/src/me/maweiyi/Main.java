package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Display d1 = new Display(new StringDisplayImpl("AAAAAA"));
        Display d2 = new CountDisplay(new StringDisplayImpl("BBBBBB"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("CCCCCC"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
