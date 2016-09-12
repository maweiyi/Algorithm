package me.maweiyi;

public class Main {

    public static String replaceSpace(StringBuffer str) {

        String ss = new String(str);

        return ss.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(Main.replaceSpace(new StringBuffer("We Are Happy")));

    }
}
