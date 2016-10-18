package me.maweiyi;

/**
 * Created by maweiyi on 10/18/16.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exec();
    }
}
