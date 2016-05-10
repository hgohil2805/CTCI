package LeetCode;

/**
 * Created by iceman on 5/9/2016.
 */
public class BuySellBest {

    public static void main(String args[]){
        int[] input = {3,5,9,1};
        BuySellBest obj = new BuySellBest();
        System.out.println(obj.maxProfit(input));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int minElement = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            profit = Math.max(profit, prices[i]-minElement);
            minElement = Math.min(minElement, prices[i]);
        }
        return profit;
    }
}
