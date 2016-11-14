package me.maweiyi;

public class Main {

    public static void maopao() {
        int[] a = {7, 3, 100, 7, 8, 4, 1, 2};

        int tmp = 0;

        for (int i = a.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (a[j - 1] > a[j]) {
                    tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;

                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void xueze(){
        int[] a = {3, 100, 7, 8, 4, 1, 2};

        for (int i = 0; i < a.length - 1; i++) {
            int pp = a[i], k = -1, tmp;//选出一个标志
            for (int j = i; j < a.length; j++) {
                if (pp > a[j]) {
                    pp = a[j];//记录最小值
                    k = j;//记录最小值的下标
                }
            }

            if (k != -1) {
                tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
            
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
	// write your code here
        //Main.maopao();
        Main.xueze();

    }
}
