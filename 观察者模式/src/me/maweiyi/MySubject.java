package me.maweiyi;

/**
 * Created by maweiyi on 10/15/16.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
