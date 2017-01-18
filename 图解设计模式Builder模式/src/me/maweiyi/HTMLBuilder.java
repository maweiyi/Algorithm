package me.maweiyi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by MWY
 * Date: 1/16/17
 * Time: 20:13
 */
public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;


    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title +"</h1>");
    }

    @Override
    public void makString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItem(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
    }

    public String getResult() {
        return filename;
    }
}
