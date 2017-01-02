package me.maweiyi;

/**
 * 计数和基数排序是时间复杂度为O(N)的算法
 * 不是基于比较的算法
 * 思想来自桶排序
 * 1.初始化一个大小为(k+1)的数组C(所有元素初始值为0)
 * 2.将C中每个i位置的元素大小改为C数组的前i项和
 * 3.初始化一个和A同样大小的数组B用于存储排序后数组，然后倒序遍历A中元素
 * 通过查找C数组，将该元素放置到B中相应的位置，同时将C中对应的元素大小-1
 */

public class Main {

    public static int[] countSort(int[] arr, int k) {
        int[] C = new int[k + 1];
        int length = arr.length, sum = 0;
        int[] B = new int[length];
        for (int i = 0; i < length; i++) {
            C[arr[i]] += 1;
        }

        for (int i = 0; i < k + 1; i++) {
            sum += C[i];
            C[i] = sum;
        }

        for (int i = length - 1; i >= 0; i--) {
            B[C[arr[i]] - 1] = arr[i];
            C[arr[i]]--;
        }

        return B;

    }

    public static void main(String[] args) {
	// write your code here
        int[] A=new int[]{2,5,3,0,2,3,0,3};
        int[] B=countSort(A, 5);
        for(int i=0;i<A.length;i++)
        {
            System.out.println((i+1)+"th:"+B[i]);
        }
    }
}
