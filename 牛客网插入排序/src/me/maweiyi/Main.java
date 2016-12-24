package me.maweiyi;

public class Main {

    //插入排序

    public static int[] insertionSort(int[] A, int n) {
        //System.out.println(A.length);
        for (int i = 1; i < A.length; i++) {
            int flag = A[i], postion = i, insertpostion = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (flag < A[j]) {
                    insertpostion = j;//进行移位插入,确定插入位置

                }

                if (insertpostion != -1) {

                    while (postion > insertpostion && j == 0) {
                        A[postion] = A[postion - 1];
                        postion--;
                    }
                    if (j == 0) {
                        A[insertpostion] = flag;
                    }
                }
            }
            /*for (int k = 0;  k < A.length;  k++) {
                System.out.print(A[k] + " ");

            }
            System.out.println();*/
        }

        return A;
    }

    public static void main(String[] args) {
	// write your code here

        int[] a = {4, 5, 3, 2, 1, 7, 6 };

        Main.insertionSort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
