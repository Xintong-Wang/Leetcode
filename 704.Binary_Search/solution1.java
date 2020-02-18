class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length, left = 0;
        while(1 < right - left){
            int mid = left + (right - left) / 2;
            if(target < nums[mid])
                right = mid;
            else
                left = mid;
        }
        return target == nums[left] ? left : -1;
    }
}
