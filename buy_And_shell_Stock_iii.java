public class buy_And_shell_Stock_iii {
    
    public int maxProfit(int[] prices) {
        int firstBuyProfit = Integer.MIN_VALUE;
        int secondBuyProfit = Integer.MIN_VALUE;
        int firstSellProfit = 0;
        int secondSellProfit = 0;

        for(int i = 0; i < prices.length; i++){
            firstBuyProfit = Math.max(firstBuyProfit, -prices[i]);

            firstSellProfit = Math.max(firstSellProfit, firstBuyProfit + prices[i]);

            secondBuyProfit = Math.max(secondBuyProfit, firstSellProfit - prices[i]);

            secondSellProfit = Math.max(secondSellProfit, secondBuyProfit + prices[i]);
        }

        return secondSellProfit;
        
    }

}
