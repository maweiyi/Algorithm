package me.maweiyi;

public class Main {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (i >0 && A[i-1] == A[i]) {
                count++;
                if (count >= 1) {
                    continue;
                } else {
                    count = 1;
                }
            }
            A[index++] = A[i];
        }
        return index;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
