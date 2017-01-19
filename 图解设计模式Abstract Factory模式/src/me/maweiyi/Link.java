package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/19/17
 * Time: 18:42
 */
public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
