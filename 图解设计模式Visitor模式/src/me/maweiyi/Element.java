package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/31/17
 * Time: 15:04
 */
public interface Element {
    public abstract void accept(Visitor v);
}
