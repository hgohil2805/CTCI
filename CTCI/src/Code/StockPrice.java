package Code;
import java.util.Arrays;


public class StockPrice 
{
	int maxProfit(int price[], int n)
	{
	    // Create profit array and initialize it as 0
	    int[] profit = new int[n];
	    for (int i=0; i<n; i++)
	        profit[i] = 0;
	 
	    int max_price = price[n-1];
	    for (int i=n-2;i>=0;i--)
	    {
	        if (price[i] > max_price)
	            max_price = price[i];
	 
	        
	        profit[i] = Math.max(profit[i+1], max_price-price[i]);
	    }
	    System.out.println("Array after right to left is");
	    System.out.println(Arrays.toString(profit));
	 
	    int min_price = price[0];
	    System.out.println("From left to right");
	    for (int i=1; i<n; i++)
	    {
	        if (price[i] < min_price)
	            min_price = price[i];
	 
	        profit[i] = Math.max(profit[i-1], profit[i] +
	                                    (price[i]-min_price) );
	        
	    }
	    System.out.println(Arrays.toString(profit));
	    int result = profit[n-1];
	 
	   // delete [] profit; // To avoid memory leak
	 
	    return result;
	}
	
	public static void main(String args[])
	{
		StockPrice obj = new StockPrice();
		int price[] = {10,22,5,75,65,80};
		System.out.println(Arrays.toString(price));
		System.out.println(obj.maxProfit(price,price.length ));
	}
}
