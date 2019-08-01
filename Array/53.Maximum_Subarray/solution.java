class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int smallest = -2147483647;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > smallest){
                smallest = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return smallest;
    }
}
