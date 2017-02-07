package me.maweiyi;

/**
 * Created by MWY
 * Date: 2/4/17
 * Time: 23:12
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
