package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/25/17
 * Time: 15:26
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
