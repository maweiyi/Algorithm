package me.maweiyi;

public class Main {

    //策略模式定义了一系列算法,并将每个算法封装起来，
    // 使他们可以相互替换,且算法的b变化不会影响到使用算法的用户

    public static void main(String[] args) {
	// write your code here

        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
