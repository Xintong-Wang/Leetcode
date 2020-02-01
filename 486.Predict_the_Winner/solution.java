class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return getScore(nums, 0, nums.length - 1) >= 0;
    }
    private int getScore(int[] nums, int left, int right){
        if(left == right)
            return nums[left];
        return Math.max(nums[left] - getScore(nums, left + 1, right), nums[right] - getScore(nums, left, right - 1));
    }
}
