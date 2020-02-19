class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i < prices.length; i++){
            int temp = 0;
            if(prices[i] < min)
                min = prices[i];
            if(prices[i] > min)
                temp = prices[i] - min;
            if(temp > res)
                res = temp;
        }
        return res;
    }
}
