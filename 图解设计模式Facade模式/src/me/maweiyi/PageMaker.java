package me.maweiyi;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by MWY
 * Date: 2/3/17
 * Time: 08:30
 */
public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailaddr, String filename) throws IOException {
        Properties mailprop = Database.getProperties("src/me/maweiyi/maildata");
        String username = mailprop.getProperty(mailaddr);
        HtmlWrite writer = new HtmlWrite(new FileWriter(filename));
        writer.title("Welcome to" + username + "'s page!");
        writer.paragraph(username + "欢迎来到" + username + "的主页。");
        writer.paragraph("等着你的邮件");
        writer.mailto(mailaddr, username);
        writer.close();

        System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
    }
}
