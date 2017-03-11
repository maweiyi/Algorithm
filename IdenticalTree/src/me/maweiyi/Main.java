package me.maweiyi;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

/**
 * 先序遍历求出字符串，然后用KMP求是否含有子串
 */

public class Main {
    
    public static StringBuffer TREESTRING = new StringBuffer();
    public static StringBuffer ATREE;
    public static StringBuffer BTREE;
    
    //先序遍历
    public void preSearch(TreeNode tree) {
        /*if (tree != null) {
            TREESTRING.append(tree.val);
            preSearch(tree.left);
            preSearch(tree.right);
        }*/
        
        if (tree == null) {
            TREESTRING.append("#!");
        } else {
    
            TREESTRING.append(tree.val);
            TREESTRING.append("!");
            preSearch(tree.left);
            preSearch(tree.right);
        }
        
    }
    
    public void makeNext(StringBuffer B , int[] next) {
        int q, k;
        int len = B.length();
        next[0] = 0;
        for (q = 1, k = 0; q < len; ++q) {
            while (k > 0 && B.charAt(q) != B.charAt(k)) {
                k = next[k - 1];
            }
            if (B.charAt(q) == B.charAt(k)) {
                k++;
            }
            next[q] = k;
        }
    }
    
    public boolean kmp(StringBuffer A, StringBuffer B, int[] next) {
        int n, m;
        int i, q;
        n = A.length();
        m = B.length();
        makeNext(B, next);
        for (i = 0, q = 0; i < n; i++) {
            while (q > 0 && B.charAt(q) != A.charAt(i)) {
                q = next[q - 1];
            }
            
            if (B.charAt(q) == A.charAt(i)) {
                q++;
            }
            if (q == m) {
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean chkIdentical(TreeNode A, TreeNode B) {
        // write code here
        preSearch(A);
        ATREE = TREESTRING;
        //ATREE = new StringBuffer("12343567");
        TREESTRING = new StringBuffer();
        preSearch(B);
        BTREE = TREESTRING;
        int[] next = new int[BTREE.length()];
        return kmp(ATREE, BTREE, next);
        
    }
    
    

    public static void main(String[] args) {
	// write your code here
        
        
        
    }
}
