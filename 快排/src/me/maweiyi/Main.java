package me.maweiyi;

/**
 * 快速排序 时间复杂度O(N * logN)
 * 随机的选中一个数，小于等于它的数放在左边，大于它的数放在右边
 * 然后对左右两个部分分别递归的调用快速排序
 * 从数组中取出a[0]放到X;
 * left = 0, right = 9(假设为数组的长度)
 * 从right向前找，找到比X小的数放到a[0]，再从left向后找，找到比X
 * 的数放到找到的比X大的位置，直到left == right
 */
public class Main {
    public static int quickSort(int[] a, int left, int right) {
        int m_left = left, m_right = right, X = a[left];

        while (m_left < m_right) {

            //从右向左寻找小于X的数
            while (m_left <m_right && a[m_right] >= X) {
                m_right--;
            }
            if (m_left < m_right) {

                a[m_left] = a[m_right];
                m_left++;
            }

            //从左向右寻找大于X的数
            while (m_left < m_right && a[m_left] <= X) {
                m_left++;
            }
            if (m_left < m_right) {

                a[m_right] = a[m_left];
                m_right--;
            }
        }

        a[m_left] = X;
        return m_left;

    }
    //分治
    public static void divison(int a[], int left, int right) {
        if (left < right) {
            int mid = quickSort(a, left, right);
            divison(a, left, mid - 1);
            divison(a, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        // write your code here
        int[] a = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        divison(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
