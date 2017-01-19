package me.maweiyi;

import java.util.ArrayList;

/**
 * Created by MWY
 * Date: 1/19/17
 * Time: 18:43
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
