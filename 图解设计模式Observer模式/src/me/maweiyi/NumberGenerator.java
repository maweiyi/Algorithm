package me.maweiyi;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by MWY
 * Date: 2/4/17
 * Time: 23:05
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
