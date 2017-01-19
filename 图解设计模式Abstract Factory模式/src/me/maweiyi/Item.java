package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/19/17
 * Time: 18:19
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
