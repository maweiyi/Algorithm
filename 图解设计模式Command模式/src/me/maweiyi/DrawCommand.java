package me.maweiyi;

import java.awt.*;

/**
 * Created by MWY
 * Date: 2/9/17
 * Time: 15:46
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
