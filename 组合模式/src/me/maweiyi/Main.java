package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
    }
}
