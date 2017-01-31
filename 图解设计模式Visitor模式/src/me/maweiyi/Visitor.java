package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/31/17
 * Time: 14:58
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
