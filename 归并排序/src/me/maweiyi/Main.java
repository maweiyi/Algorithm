package me.maweiyi;

/**
 * 时间复杂度O(N * logN)
 * 归并排序
 * 快速排序
 * 堆排序
 * 希尔排序
 * 让要排序的数成为长度为1的单独区间，然后将相邻的长度为1的单独区间合并成为长度为2的单独有序区间
 * 将长度为2的有序区间合并为长度为4的单独区间
 * 将两个或者两个以上的有序表he合并成为一个新的有序表，即把排序序列分为若干个子序列，每个子序列是有序的
 * 然后把有序子序列合并为整体有序
 */

public class Main {


    public static void sort(int[] data, int left, int right) {
        if (left >= right) {
            return;
        }
        int center = (left + right) / 2;
        //System.out.printf("center----->%d", center);
        sort(data, left, center);//左边进行递归
        sort(data, center + 1, right);//右边进行递归
        merge(data, left, center, right);
        print(data);


    }

    public static void merge(int[] data, int left, int center, int right) {
        int[] tempArr = new int[data.length];
        int mid = center + 1; //右边数组第一个元素索引
        int third = left; //记录临时数组的索引
        int tmp = left; //缓存左数组第一个元素的索引
        while (left <= center && mid <= right) {
            if (data[left] <= data[mid]) {
                tempArr[third++] = data[left++];
            } else {
                tempArr[third++] = data[mid++];
            }
        }

        //剩下部分依次放入临时数组
        while (mid <= right) {
            tempArr[third++] = data[mid++];
        }

        while (left <= center) {
            tempArr[third++] = data[left++];
        }

        while (tmp <= right) {
            data[tmp] = tempArr[tmp++];
        }

    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        Main.sort(new int[]{8, 3, 2, 5, 4, 6, 1, 7}, 0, 7);
    }
}
