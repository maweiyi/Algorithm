package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/19/17
 * Time: 21:34
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {

        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
