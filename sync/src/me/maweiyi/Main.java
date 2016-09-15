package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
