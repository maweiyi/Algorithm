package me.maweiyi;

/**
 * Created by maweiyi on 10/24/16.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
