package me.maweiyi;

public class Main {
    /**
     * 二叉堆是完全二叉树 或者近似完全二叉树
     * 父节点的键值总是大于或等于任何一个子节点的键值
     * 每个节点的左子树和右子树都是一个二叉堆
     * 当父节点的键值总是大于或等于任何一个子节点的键值时为大根堆
     * 当父节点的键值总是小于或等于任何一个子节点的键值时为小根堆
     * 一般用数组来表示堆，i节点的父节点下标为(i-1)/2,它的左右子节点为
     * i * 2 + 1, i * 2 + 2
     *
     *
     */

    public static void heapAdjust(int[] a, int i, int size) {
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

    public static void buildHeap(int[] a, int size) {
        int i;
        for (i = size / 2; i >= 0; i--) {
            heapAdjust(a, i, size);
        }
    }

    public static void heapSort(int[] a, int size) {
        int i;
        buildHeap(a, size);
        for (i = size; i >= 0; i--) {
            int tmp;
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            heapAdjust(a, 0, i - 1);
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] a = {0, 16, 20, 3, 11, 17, 8};
        heapSort(a, 6);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
