package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bridge bridge = new MyBridge();

        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();


        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
