package me.maweiyi;

public class IdenticalTree {
    public static int[] a;
    public static int count = 0;

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //遍历构建二叉树
    public TreeNode createTree() {
        TreeNode node = null;

        if (count < a.length && a[count++] != -1) {
            node = new TreeNode(a[count - 1]);
            node.left = createTree();
            node.right = createTree();
        } else {
            node = null;
        }

        return node;
    }
    //遍历二叉树
    public void predOrder(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            predOrder(node.left);
            predOrder(node.right);
        }
    }

    public static void main(String[] args) {
        // write your code here
        a = new int[]{1, 2, -1, -1, 3, 4, -1, -1, 5, 6};
        IdenticalTree identicalTree = new IdenticalTree();
        TreeNode node = null;
        node = identicalTree.createTree();
        identicalTree.predOrder(node);


        System.out.println(node.left.val);

    }
}
