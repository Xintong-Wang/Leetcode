class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = 0, res = nums.length;
        Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(!first.containsKey(nums[i]))
                first.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if(count.get(nums[i]) == degree)
                res = Math.min(res, i - first.get(nums[i]) + 1);
            else if(count.get(nums[i]) > degree){
                res = i - first.get(nums[i]) + 1;
                degree = count.get(nums[i]);
            }
        }
        return res;
    }
}
