package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/27/17
 * Time: 22:24
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display) {
        this.display = display;
    }
}
