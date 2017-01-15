package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/15/17
 * Time: 19:32
 */
public interface Product extends Cloneable {
     void use(String s);
     Product createClone();
}
