package LeetCode;

/**
 * Created by iceman on 8/19/2016.
 */
public class BestTimeToBuySell2 {

    public static void main(String args[]){
        BestTimeToBuySell2 obj = new BestTimeToBuySell2();
        int[] input = {1,2,3};
        System.out.println(obj.maxProfit(input));
    }


    public int maxProfit(int[] prices) {
        int total = 0;
        for(int i = 0 ; i < prices.length - 1 ; i ++){
            if(prices[i+1] > prices[i])
                total += prices[i+1] - prices[i];
        }
        return total;
    }
}


