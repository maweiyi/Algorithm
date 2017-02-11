package me.maweiyi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by MWY
 * Date: 2/7/17
 * Time: 20:49
 */
public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./src/me/maweiyi/big" + charname + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.println(fontdata);
    }
}
