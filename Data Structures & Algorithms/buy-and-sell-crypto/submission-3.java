class Solution {
    public int maxProfit(int[] prices) {
        // int max=0;
        // for (int i=0;i<prices.length;i++){
        //     for (int j=i;j<prices.length;j++){
        //         if(prices[j]-prices[i]>max)
        //             max=prices[j]-prices[i];
        //     }
        // }
        // return max;//bruteforce
        
        int minPrice=prices[0];
        int maxProfit=0;
        for (int price:prices){
            minPrice=Math.min(minPrice,price);
            int profit=price-minPrice;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}
