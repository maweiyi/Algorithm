package me.maweiyi;

/**
 * Created by MWY
 * Date: 2/2/17
 * Time: 19:48
 */
public class SpecicalSupport extends Support {
    private int number;
    public SpecicalSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
