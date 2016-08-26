package LeetCode;

/**
 * Created by iceman on 8/26/2016.
 */
public class BestBuySellWithCoolDown {

    public static void main(String args[]){
        BestBuySellWithCoolDown obj = new BestBuySellWithCoolDown();
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println("Max Profit is: "+obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = Integer.MIN_VALUE;
        int prev_sell = 0;
        int prev_buy;

        for(int price : prices){
            prev_buy = buy;
            buy = Math.max(prev_sell - price,prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price,prev_sell);
        }
        return sell;
    }
}
