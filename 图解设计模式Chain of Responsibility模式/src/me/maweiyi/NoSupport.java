package me.maweiyi;

/**
 * Created by MWY
 * Date: 2/2/17
 * Time: 19:40
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
