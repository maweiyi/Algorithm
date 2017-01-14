package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/14/17
 * Time: 18:32
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
