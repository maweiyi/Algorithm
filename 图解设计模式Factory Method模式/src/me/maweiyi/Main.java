package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        card1.use();
        card2.use();

        System.out.println();
    }
}
