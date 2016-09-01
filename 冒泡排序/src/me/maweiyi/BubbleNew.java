package me.maweiyi;

/**
 * Created by maweiyi on 9/1/16.
 */
public class BubbleNew {
    public static void main(String[] args) {
        int[] a = {9, 4, 5, 6, 11, 3, 2, 7, 10, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int as :
                a) {
            System.out.println(as);
        }

    }
}
