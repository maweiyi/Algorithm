package me.maweiyi;

/**
 * Created by maweiyi on 10/8/16.
 */
public class Proxy implements Sourceable {

    private Source source;
    public Proxy() {
        this.source = new Source();
    }
    @Override
    public void method() {
        bofore();
        source.method();
        after();
    }

    private void bofore() {
        System.out.println("before proxy!");
    }

    private void after() {
        System.out.println("after proxy!");
    }
}
