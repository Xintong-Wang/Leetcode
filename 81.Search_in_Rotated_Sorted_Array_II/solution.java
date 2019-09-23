class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] > nums[left]){
                if((nums[left] <= target) && (nums[mid] > target )){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else if(nums[mid] < nums[left]){
                if((nums[right] >= target) && (nums[mid] < target)){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            else{
                left++;
            }
        }
        return false;
    }
}
