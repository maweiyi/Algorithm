package me.maweiyi;

public class Main {

    public static int[] selectionSort(int[] A, int n) {
        for (int i = 0; i < A.length; i++) {
            //k记录每次最小值出现的位置
            Integer a = A[i], k = i;
            for (int j = i; j < A.length; j++) {
                if (a > A[j]) {
                    a = A[j];
                    k = j;
                }
            }

            A[k] = A[i];
            A[i] = a;


        }

        return A;
    }
    public static void main(String[] args) {
	// write your code here
        int[] A = new int[] {4, 6, 3, 5, 7, 1, 8, 2};
       int[] s = selectionSort(A, A.length);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
