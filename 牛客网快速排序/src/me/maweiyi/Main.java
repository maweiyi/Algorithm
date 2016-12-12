package me.maweiyi;

public class Main {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int pivot=partition(arr, low, high);        //将数组分为两部分
            quickSort(arr, low, pivot-1);                   //递归排序左子数组
            quickSort(arr, pivot+1, high);                  //递归排序右子数组
        }
    }

    public static int partition(int[] arr, int low, int high) {
        //low作为选取的标识位
        int flag = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= flag) --high;
            arr[low] = arr[high];
            while (low < high && arr[low] <= flag) ++low;
            arr[high] = arr[low];
        }

        arr[low] = flag;
        return low;
    }

    public static void main(String[] args) {
	// write your code here
        int[] a = new int[] {3, 5, 4, 1, 7, 6, 2};
        quickSort(a, 0, 6);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
