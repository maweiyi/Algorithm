package me.maweiyi;

public class Main {

    public static int[] sort(int[]A, int n) {
        mergesort(A, 0, n);
        return A;
    }

    public static void mergesort(int[] A, int m, int n) {

        if (m >= n) return;
        int center = (m + n) / 2;
        mergesort(A, m, center);
        mergesort(A, center + 1, n);
        merge(A, m, center, n);

    }


    public static void merge(int[] A, int left, int center, int right) {
        int[] tempArr = new int[A.length];
        int mid = center + 1;//右边数组的第一个索引
        int third = left;//记录临时数组的索引
        //缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            if (A[left] <= A[mid]) {
                tempArr[third++] = A[left++];
            } else {
                tempArr[third++] = A[mid++];
            }
        }

        while (mid <= right) {
            tempArr[third++] = A[mid++];
        }
        while (left <= center) {
            tempArr[third++] = A[left++];
        }

        while (tmp <= right) {
            A[tmp] = tempArr[tmp++];
        }
    }

    public static void main(String[] args) {
	// write your code here

        int[] A = {2, 1, 3, 6, 5, 4};

        sort(A, A.length -1);
    }

}
