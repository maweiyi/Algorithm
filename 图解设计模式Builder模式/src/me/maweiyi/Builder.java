package me.maweiyi;


/**
 * Created by MWY
 * Date: 1/16/17
 * Time: 19:00
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makString(String str);
    public abstract void makeItem(String[] items);
    public abstract void close();
}
