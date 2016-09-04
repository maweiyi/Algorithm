package me.maweiyi;

public class Main {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                ans += prices[i] - prices[i-1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
