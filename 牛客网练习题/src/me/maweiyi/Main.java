package me.maweiyi;

public class Main {

    public static int[] BubbleSort(int[] A, int n) {
        int tmp;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (A[j - 1] > A[j]) {
                    tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                }
            }
        }

        return A;
    }

    public static void main(String[] args) {
	// write your code here

        int[] a = {8, 10, 7, 5, 12, 6};
        BubbleSort(a, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
