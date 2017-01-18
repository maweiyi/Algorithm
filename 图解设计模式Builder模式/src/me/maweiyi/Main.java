package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director1 = new Director(htmlBuilder);
        director1.construct();
        String filename = htmlBuilder.getResult();
        System.out.println(filename + "文件编写完成。");
    }


}
