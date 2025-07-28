class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
      
        for (int price : prices) {
            // Calculate the maximum profit by comparing the current 'maxProfit'
            // with the difference of the current price and the 'minPrice'.
            maxProfit = Math.max(maxProfit, price - minPrice);
          
            // Update the 'minPrice' if a lower price is found.
            minPrice = Math.min(minPrice, price);
        }
      
        // Return the maximum profit that can be achieved.
        return maxProfit; 
    }
}