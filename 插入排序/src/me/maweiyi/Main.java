package me.maweiyi;

public class Main {

    /**
     *  插入排序
     *  时间复杂度O(n^2)
     *  首先位置1上的数和位置0上的数进行比较，结果大的放到后面，然后
     *  位置2上的数和位置1上的数进行比较，如果比较小放在1的位置，再和位置0上的数进行比较
     *  后面的依次
     */
    public static void insert() {
        Integer[] a = {6, 5, 3, 1, 8, 7, 2, 4};
        for (int i = 1; i < a.length; i++) {
            Integer flag = a[i];
            for (int j = i-1; j >= 0; j--) {
                if (flag < a[j]) {
                    a[j + 1] = a[j];
                    a[j] = flag;
                }



                }


            }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }

    public static void main(String[] args) {
	// write your code here
        Main.insert();
    }
}
