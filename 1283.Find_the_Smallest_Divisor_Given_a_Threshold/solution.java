class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = nums[nums.length - 1];
        while(left < right){
            int mid = (right - left) / 2 + left;
            if(sum(nums, mid) <= threshold)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
    private int sum(int[] nums, int divider){
        int sum = 0;
        for(int num : nums){
            sum += (num + (divider - 1)) / divider;
        }
        return sum;
    }
}
