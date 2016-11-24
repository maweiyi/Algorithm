package me.maweiyi;

public class Main {

    //希尔排序

    public static void shellSort(int[] a, int length) {
        int d = length / 2; //步长
        int i, j, tmp;
        while (d >= 1) {

            for (i = d;  i < length;  i++) {

                tmp = a[i];
                j = i - d;
                while (j >=0 && a[j] > tmp) {
                    a[j + d] = a[j];
                    j = j - d;
                }
                a[j + d] = tmp;
            }

            d /= 2;
        }
    }


    public static void main(String[] args) {
	// write your code here

        int[] a = {8, 4, 5, 9, 0, 10, 6};
        shellSort(a, 7);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }
}
