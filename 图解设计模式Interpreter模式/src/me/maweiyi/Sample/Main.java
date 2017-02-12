package me.maweiyi.Sample;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./src/me/maweiyi/Sample/program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
