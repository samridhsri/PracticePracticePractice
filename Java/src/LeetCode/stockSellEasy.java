package LeetCode;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class stockSellEasy {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxprofit = 0;
        for(int i = 0; i<prices.length; i++){
            int temp = prices[i] - mini;
            if(temp>maxprofit){
                maxprofit = temp;
            }
            if(prices[i]<mini){
                mini = prices[i];
            }
        }
        return maxprofit;
    }
}
