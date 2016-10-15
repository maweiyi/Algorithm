package me.maweiyi;

/**
 * Created by maweiyi on 10/15/16.
 */
public interface Subject {
    void add(Observer observer);
    void del(Observer observer);
    void notifyObservers();
    void operation();

}
