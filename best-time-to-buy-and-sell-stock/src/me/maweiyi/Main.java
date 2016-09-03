package me.maweiyi;


public class Main {

    public int maxProfit(int[] prices) {


        if (prices.length == 0) return 0;

        int low = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < low) low = prices[i];
            else if (prices[i] - low > ans) ans = prices[i] - low;
        }

        return ans;

    }

    public static void main(String[] args) {
	// write your code here

        Main main = new Main();
        System.out.println(main.maxProfit(new int[]{1, 2, 3, 100, 5}));
    }
}
