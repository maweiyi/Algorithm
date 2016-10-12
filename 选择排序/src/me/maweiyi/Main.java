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
        int[] a = {6, 3, 5, 7, 0, 4, 2, 1};
        int tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
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
