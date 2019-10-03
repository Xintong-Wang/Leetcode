class Solution {
    public int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        for(int i = 0; i < nums.length; i++){
            right += nums[i];
            if(nums[i] > left)
                left = nums[i];
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(split(nums, m, mid))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
    public boolean split(int[] nums, int m, int mid){
        int count = 1, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > mid){
                sum = nums[i];
                count++;
                if(count > m)
                    return false;
            }
        }
        return true;
    }
}
