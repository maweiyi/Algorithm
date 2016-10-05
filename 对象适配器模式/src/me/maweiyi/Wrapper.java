package me.maweiyi;

/**
 * Created by maweiyi on 10/5/16.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}