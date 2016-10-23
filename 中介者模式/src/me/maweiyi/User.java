package me.maweiyi;

/**
 * Created by maweiyi on 10/23/16.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void work();
}
