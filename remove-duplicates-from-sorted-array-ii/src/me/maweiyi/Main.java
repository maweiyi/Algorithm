package me.maweiyi;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i > 0 && A[i-1] == A[i]) {
                count++;
                if (count >= 3) {
                    continue;
                }
            } else {
                count = 1;

            }
            A[sum++] = A[i];
        }
        return sum;
    }

}
