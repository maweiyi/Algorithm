package me.maweiyi;

public class KMP {

    public void makeNext(String pattern, int next[]) {
        int q, k;
        int len = pattern.length();
        next[0] = 0;
        for (q = 1, k = 0;  q < len; ++q) {
            while (k > 0 && pattern.charAt(q) != pattern.charAt(k)) {
                k = next[k - 1];
            }
            if (pattern.charAt(q) == pattern.charAt(k)) {
                k++;
            }
            next[q] = k;
        }

    }

    public int kmp(String s, String pattern, int[] next) {
        int n, m;
        int i, q;
        n = s.length();
        m = pattern.length();
        makeNext(pattern, next);
        for (i = 0, q = 0; i < n; i++) {
            while (q > 0 && pattern.charAt(q) != s.charAt(i)) {
                q = next[q - 1];
            }
            if (pattern.charAt(q) == s.charAt(i)) {
                q++;
            }
            if (q == m) {
                return i - m + 1;
            }
        }

        return -1;
        //return postion;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        KMP kmp = new KMP();
        String str = "abababdafdasabcdabdfdfeaba";
        String pattern = "abcdabd";
        int[] next = new int[pattern.length()];
        System.out.println(kmp.kmp(str, pattern, next));
    }

}

