package me.mwy;


/**
 * Created by MWY
 * Date: 1/11/17
 * Time: 14:52
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        //super(string);
        this.banner = new Banner(string);

    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
