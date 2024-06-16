class Solution {
    public int maxProfit(int[] prices) {

    if(prices==null||prices.length==0){
        return 0;

    }
    int profit=0;
    int buy_price=prices[0];
    for(int i=1;i<prices.length;i++){
        if(prices[i]<buy_price){
            buy_price=prices[i];
            continue;
        }
        profit=Math.max(profit,prices[i]-buy_price);
        
    }
    return profit;
        
    }
}
