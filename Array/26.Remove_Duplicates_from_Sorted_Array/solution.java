class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[result] != nums[i]){
                result += 1;
                nums[result] = nums[i];
            }
        }
        return result + 1;
    }
}
