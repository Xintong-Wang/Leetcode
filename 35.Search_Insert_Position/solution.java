class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int j = 0; j < nums.length; j++){
            if((nums[j] < target && j + 1 == nums.length) || (nums[j] < target && nums[j + 1] > target)){
                return j+1;
            }
            else if(nums[j] == target){
                return j;
            }
        }
        return 0;
    }
}
