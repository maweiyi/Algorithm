package me.maweiyi;

/**
 * Created by maweiyi on 10/4/16.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("This is the targetable method!");
    }
}
