package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/27/17
 * Time: 22:04
 */
public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }
    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
        //return null;
    }
}
