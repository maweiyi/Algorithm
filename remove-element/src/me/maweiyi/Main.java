package me.maweiyi;

public class Main {

    public static int removeElement(int[] A, int elem) {

        int len = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[len++] = A[i];
            }
        }

        return len;
    }

    public static void main(String[] args) {
        // write your code here
        Main.removeElement(new int[]{4, 5}, 4);
    }
}
