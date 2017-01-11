package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/11/17
 * Time: 14:52
 */
public class Banner {

    private String string;
    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }


}
