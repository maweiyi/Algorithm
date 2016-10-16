package me.maweiyi;

/**
 * Created by maweiyi on 10/16/16.
 */
public interface Collection {
    Iterator iterator();
    Object get(int i);
    int size();
}
