package me.maweiyi;

/**
 * Created by MWY
 * Date: 2/2/17
 * Time: 19:09
 */
public class Trouble {
    private int number;
    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
