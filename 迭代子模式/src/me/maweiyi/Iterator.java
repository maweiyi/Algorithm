package me.maweiyi;

/**
 * Created by maweiyi on 10/16/16.
 */
public interface Iterator {
    Object previous();
    Object next();
    boolean hasNext();
    Object first();
}
