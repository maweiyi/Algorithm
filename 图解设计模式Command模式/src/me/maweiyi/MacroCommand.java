package me.maweiyi;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by MWY
 * Date: 2/9/17
 * Time: 15:05
 */
public class MacroCommand implements Command {
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator iterable = commands.iterator();
        while (iterable.hasNext()) {
            ((Command)iterable.next()).execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != null) {
            commands.push(cmd);
        }
    }


    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
