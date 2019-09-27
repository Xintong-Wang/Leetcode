class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for(int i = 0; i < nums.length; ++i) {
            int left = 0, right = len;
            while(left < right){
                int mid = left + (right - left) / 2;
                if (dp[mid] < nums[i]) 
                    left = mid + 1;
                else 
                    right = mid;
            }
            if (right >= len){
                dp[len] = nums[i];
                len++;
            }
            else 
                dp[right] = nums[i];
        }
        return len;
    }
}

