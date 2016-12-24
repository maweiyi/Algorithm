package me.maweiyi;

public class Main {

    public static int[] shellSort(int[] A, int n) {
        int length = n / 2; //步长
        int j = 0, tmp;
        while (length >= 1) {
            for (int i = length; i < n; i++) {
                tmp = A[i];
                j = i - length;
                while (j >= 0 && A[j] > tmp) {
                    A[j +length] = A[j];
                    //A[j] = tmp;
                    j = j - length;
                }
                A[j + length] = tmp;
            }

            length /= 2;
        }

        return A;
    }

    public static void main(String[] args) {
	// write your code here
        int[] a = {8, 4, 5, 9, 0, 10, 6};

        shellSort(a, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
