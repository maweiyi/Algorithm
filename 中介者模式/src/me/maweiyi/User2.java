package me.maweiyi;

/**
 * Created by maweiyi on 10/23/16.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
