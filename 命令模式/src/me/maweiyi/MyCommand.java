package me.maweiyi;

/**
 * Created by maweiyi on 10/18/16.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void exec() {
        receiver.action();
    }
}
