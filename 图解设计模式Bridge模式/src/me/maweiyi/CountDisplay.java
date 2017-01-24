package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/23/17
 * Time: 17:52
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
