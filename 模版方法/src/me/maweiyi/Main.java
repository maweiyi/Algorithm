package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String exp = "8+8";
        AbstarctCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
