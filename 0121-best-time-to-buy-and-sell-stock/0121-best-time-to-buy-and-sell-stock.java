class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(buy > prices[i]) buy = prices[i];
            profit = ((prices[i] - buy) > profit) ? prices[i] - buy : profit;
        }
        return profit;
    }
}


// Time Limit Exceeded
// class Solution {
//     public int maxProfit(int[] prices) {
//         int res = 0;
//         for(int i = 0; i < prices.length; i++) {
//             for(int j = i+1; j < prices.length; j++) {
//                 int cres = (prices[i] < prices[j]) ? prices[j] - prices[i] : 0;
//                 res = (cres > res) ? cres : res;
//             }
//         }
//         return res;
//     }
// }