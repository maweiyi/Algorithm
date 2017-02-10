package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName());
        p.print("Hello World!");
    }
}
