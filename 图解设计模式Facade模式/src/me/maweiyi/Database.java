package me.maweiyi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by MWY
 * Date: 2/3/17
 * Time: 08:12
 */
public abstract class Database {
    private Database() {

    }

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
}
