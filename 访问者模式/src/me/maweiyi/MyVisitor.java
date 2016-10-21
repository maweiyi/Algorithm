package me.maweiyi;

/**
 * Created by maweiyi on 10/21/16.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("Visit the subject:" + sub.getSubject());
    }
}
