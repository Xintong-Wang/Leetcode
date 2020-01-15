class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            int sim = mid ^ 1;
            if(nums[mid] == nums[sim])
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
}
