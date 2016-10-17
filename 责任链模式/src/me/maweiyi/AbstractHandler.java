package me.maweiyi;

/**
 * Created by maweiyi on 10/17/16.
 */
public abstract class AbstractHandler {
    Handler handler;

    Handler getHandler() {
        return handler;
    }

    void setHandler(Handler handler) {
        this.handler = handler;
    }
}
