package me.maweiyi;


/**
 * 将某个类的接口转换成客户端期望的另一个接口的表示，目的是消除由于类接口不匹配所造成的类的兼容性问题
 * 类的适配器模式
 * 对象的适配器模式
 * 接口的适配器模式
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
