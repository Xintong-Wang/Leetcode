class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] res = new int[nums[n - 1] - nums[0] + 1];
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                res[nums[j] - nums[i]]++;
            }
        }
        for(int i = 0; i < res.length; i++){
            k -= res[i];
            if(k <= 0)
                return i;
        }
        return 0;
    }
}
