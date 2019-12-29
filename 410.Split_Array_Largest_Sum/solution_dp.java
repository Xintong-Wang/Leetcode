class Solution {
    public int splitArray(int[] nums, int m){
        int n = nums.length;
        int[][] dp = new int[m + 1][n];
        for(int i = 0; i < m + 1; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        int sum[] = new int[n];
        sum[0] = nums[0];
        for(int i = 1; i < n; i++){
            sum[i] = sum[i - 1] + nums[i];
        }
        for(int i = 0; i < n; i++){
            dp[1][i] = sum[i];
        }
        for(int i = 2; i <= m; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < j; k++){
                    int val = Math.max(dp[i - 1][k], sum[j] - sum[k]);
                    dp[i][j] = Math.min(val, dp[i][j]);
                }
            }
        }
        return dp[m][n - 1];
    }
}
