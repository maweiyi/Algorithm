package me.maweiyi;

/**
 * Created by maweiyi on 10/15/16.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
