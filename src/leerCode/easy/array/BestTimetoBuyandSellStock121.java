package leerCode.easy.array;

public class BestTimetoBuyandSellStock121 {

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/
	
	public static void main(String[] args) throws Exception {
		
		BestTimetoBuyandSellStock121 obj = new BestTimetoBuyandSellStock121();		
		System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
		System.out.println("Teste1: "+obj.testOne());
		
		
		System.out.println(obj.maxProfit(new int[]{7,6,4,3,1}));
		System.out.println("Teste2: "+obj.testTwo());
		
	}
			
	public int maxProfit(int[] prices) throws Exception {
        
		int leastSoFar = Integer.MAX_VALUE; // least so far
        int overallProfit = 0; // overall profit
        int profitSoldIfToday = 0; // profit if sold today
        
        for(int i = 0; i < prices.length; i++){            
        	if(prices[i] < leastSoFar){ // if we found new buy value which is more smaller then previous one
        		leastSoFar = prices[i]; // update our least so far
            }
        	profitSoldIfToday = prices[i] - leastSoFar; // calculating profit if sold today by, Buy - sell
            if(overallProfit < profitSoldIfToday){ // if 'profitSoldIfToday' is more then our previous overall profit
            	overallProfit = profitSoldIfToday; // update overall profit
            }
        }
        return overallProfit; // return op 
    }

	public boolean testOne() throws Exception {
		int[] prices = new int[]{7,1,5,3,6,4};		
		return maxProfit(prices) == 5;
	}
	
	public boolean testTwo() throws Exception {
		int[] prices = new int[]{7,6,4,3,1};		
		return maxProfit(prices) == 0;
	}
}
