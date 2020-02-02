class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        return getScore(nums, 0, n - 1, dp) >= 0;
    }
    private int getScore(int[] nums, int left, int right, int[][] dp){
        if(left == right)
            return nums[left];
        if(dp[left][right] != 0)
            return dp[left][right];
        dp[left][right] = Math.max(nums[left] - getScore(nums, left + 1, right, dp), nums[right] - getScore(nums, left, right - 1, dp));
        return dp[left][right];
    }
}
