package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        State state = new State();
        Context context = new Context(state);

        state.setValue("state1");
        context.method();

        state.setValue("state2");
        context.method();
    }
}
