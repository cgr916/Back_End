package _2_bestTime2BuyStock;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/3 - 11:50
 */
public class Profit {
    public static void main(String[] args) {
        HashMap<Object, Object> hm = new HashMap<>();
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy=prices[0],sell=0;
        for (int i = 1; i < prices.length; ++i) {
            if(buy<prices[i]){
                buy = prices[i];
            }
            profit = Math.max(prices[i]-buy,profit);
        }
        return profit;
    }
}
