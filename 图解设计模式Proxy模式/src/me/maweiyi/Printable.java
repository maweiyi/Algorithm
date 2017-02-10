package me.maweiyi;

/**
 * Created by MWY
 * Date: 2/8/17
 * Time: 13:20
 */
public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
