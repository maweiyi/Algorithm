package me.maweiyi;

/**
 * Created by MWY
 * Date: 2/6/17
 * Time: 22:21
 */
public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
