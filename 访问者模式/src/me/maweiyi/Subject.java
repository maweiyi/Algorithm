package me.maweiyi;

/**
 * Created by maweiyi on 10/21/16.
 */
public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}
