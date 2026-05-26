/* Buy & Sell Stocks

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and 
choosing a different day in the future to sell that stock. 
Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.

*/

public class BuySellStock{
    public  static int buySellStock(int price[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i] ){  // profit
                int profit= price[i]-buyPrice;   // today's profit
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyPrice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(buySellStock(price));
        
    }
}