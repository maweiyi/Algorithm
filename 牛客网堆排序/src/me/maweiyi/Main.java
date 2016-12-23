package me.maweiyi;

public class Main {

    /*public static void main(String[] args) {
	// write your code here
        int[] a = {1, 3, 2, 4, 5, 6, 7};
        for (int i = 0; i < (a.length -1) / 2; i++) {
            System.out.print(a[i] + " " + a[2 * i + 1] + " " +a[2 * i + 2]);
            System.out.println();

        }
    }*/

    public void heapAdjust(int[] a, int i, int size) {
        int leftChild = 2 * i + 1; //i的左孩子节点
        int rightChild = 2 * i + 2; //i的右孩子节点
        int max = i;

        if (i <= size / 2) {
            if (leftChild <= size && a[leftChild] > a[max]) {
                max = leftChild;
            }
            if (rightChild <= size && a[rightChild] > a[max]) {
                max = rightChild;
            }
            if (max != i) {
                int tmp;
                tmp = a[i];
                a[i] = a[max];
                a[max] = tmp;
                heapAdjust(a, max, size);
            }
        }


    }

    public void buildHeap(int[] a, int size) {
        int i;
        for (i = size / 2; i >= 0; i--) {
            heapAdjust(a, i, size);
        }
    }

    public int[] heapSort(int[] a, int n) {
        int size = n - 1;
        int i;
        buildHeap(a, size);
        for (i = size; i >= 0; i--) {
            int tmp;
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            heapAdjust(a, 0, i - 1);
        }

        return a;
    }

    public static void main(String[] args) {
        // write your code here
       // int[] a = {0, 16, 20, 3, 11, 17, 8};
        //heapSort(a, 6);

        //for (int i = 0; i < a.length; i++) {
        //    System.out.print(a[i] + " ");
        //}
    }
}
