class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        String[] res = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        String award = new String();
        for(int i = nums.length - 1; i >= 0; i--){
            int idx = map.get(nums[i]);
            if(i == nums.length - 1)
				award = "Gold Medal";
			else if(i == nums.length - 2)
				award = "Silver Medal";
			else if(i == nums.length - 3)
				award = "Bronze Medal";
            else
                award = Integer.toString(nums.length - i);
            res[idx] = award;
        }
        return res;
	}
}

