package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/16/17
 * Time: 19:10
 */
public class Director {
    private Builder builder;
    public Director (Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makString("从早上至下午");
        builder.makeItem(new String[] {
                "早上好",
                "下午好"
        });

        builder.makString("晚上");
        builder.makeItem(new String[]{
                "晚上好。",
                "晚安。",
                "再见。"
        });
        builder.close();
    }
}
