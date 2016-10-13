package me.maweiyi;

import com.sun.deploy.util.IconEncoder;

import java.io.File;

/**
 * Created by maweiyi on 10/13/16.
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
