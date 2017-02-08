package me.maweiyi;

/**
 * Created by MWY
 * Date: 2/6/17
 * Time: 22:22
 */
public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
