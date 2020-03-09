class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dup = -1, mis = -1;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 1; i <= nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2)
                    dup = i;
            }
            else
                mis = i;
        }
        return new int[] {dup, mis};
    }
}
