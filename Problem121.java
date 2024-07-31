class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = Integer.MIN_VALUE;
        int profit =0;
        int buy = prices[0];
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            profit = prices[i]-buy;
            
            maxprofit = Math.max(maxprofit,profit);
            
        }
        return maxprofit;
    }
}
