class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = searchFirstPosition(nums, target);
        int[] result = {-1, -1};
        if(nums.length == 0 || start == nums.length || nums[start] != target){
            return result;
        }
        else if(nums[nums.length - 1] == target){
            result[0] = start;
            result[1] = nums.length - 1;
            return result;
        }
        result[0] = start;
        result[1] = searchFirstPosition(nums, target + 1) - 1;
        return result;
    }
    public int searchFirstPosition(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
