package me.maweiyi;

/**
 * Created by maweiyi on 9/30/16.
 */

/**
 * 非线程安全的单例
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
