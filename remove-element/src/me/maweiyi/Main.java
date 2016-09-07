package me.maweiyi;

public class Main {

    public static int removeElement(int[] A, int elem) {
        if (A == null || A.length == 0)
            return 0;
        int len = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                if (A[len] != A[i])
                    A[len] = A[i];
                len++;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        // write your code here
        Main.removeElement(new int[]{4, 5}, 4);
    }
}
