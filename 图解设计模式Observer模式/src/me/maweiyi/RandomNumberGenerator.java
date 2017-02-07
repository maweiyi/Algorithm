package me.maweiyi;

import java.util.Random;

/**
 * Created by MWY
 * Date: 2/4/17
 * Time: 23:10
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
