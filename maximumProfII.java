public class maximumProfII {
    // User function Template for Java


    
    public int maximumProfit(int prices[]) {
        // Code here
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > buyPrice){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
                
                
            }
            else{
                buyPrice = prices[i];
            }
        }
        
        return maxProfit;
        
    }
}
    

