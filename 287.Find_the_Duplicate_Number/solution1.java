class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hSet.contains(nums[i]))
                return nums[i];
            hSet.add(nums[i]);
        }
        return -1;
    }
}
