class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        int result = 2, last = nums[0];
        for(int i = 2; i < nums.length; i++){
            if(last != nums[i]){
                last = nums[i - 1];
                nums[result] = nums[i];
                result += 1;
            }
        }
        return result;
    }
}
