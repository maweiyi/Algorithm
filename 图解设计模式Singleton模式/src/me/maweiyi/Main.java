package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 与 obj2是相同的实例.");
        } else {
            System.out.println("obj1 与 obj2是不同的实例");
        }
        System.out.println("End.");
    }
}
