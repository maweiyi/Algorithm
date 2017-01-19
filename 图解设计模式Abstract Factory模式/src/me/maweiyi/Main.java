package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory = Factory.getFactory("me.maweiyi.ListFactory");

        Link people = factory.createLink("人民日报", "http://people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link excite = factory.createLink("Excite", "http://excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "XXXX");
        page.add(traynews);
        page.add(traySearch);
        page.output();
    }
}
