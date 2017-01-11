package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/11/17
 * Time: 14:52
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);

    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
