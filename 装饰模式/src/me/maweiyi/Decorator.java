package me.maweiyi;

/**
 * Created by maweiyi on 10/7/16.
 */
public class Decorator implements Sourceable{

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator");
        source.method();
        System.out.println("after decorator");
    }
}
