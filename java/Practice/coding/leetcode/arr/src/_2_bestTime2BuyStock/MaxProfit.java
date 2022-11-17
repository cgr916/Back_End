package _2_bestTime2BuyStock;

/**
 * @author: cgr
 * @date: 2022/9/28 - 16:57
 */
public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = 0,minPrice = prices[0],profit = 0;
        int len = prices.length;
        for (int i = 1;i<len;++i) {
            if (prices[i - 1] > prices[i] || i==len-1) {
                profit = prices[i - 1] - minPrice;
                max += profit;
                minPrice = prices[i];
            } else if (prices[i - 1] < prices[i]) {
                minPrice = prices[i - 1];
            }
        }
        return max;
    }
}
