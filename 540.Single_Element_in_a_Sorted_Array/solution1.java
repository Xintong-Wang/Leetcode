class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            int sim = mid % 2 == 0 ? mid - 1 : mid + 1;
            if(nums[mid] == nums[sim])
                right = mid % 2 == 0 ? mid - 2 : mid - 1;
            else if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
                return nums[mid];
            else
                left = mid + 1;
        }
        return nums[left];
    }
}
