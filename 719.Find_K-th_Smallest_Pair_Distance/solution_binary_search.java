class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, r = nums[n - 1] - nums[0];
        while(l < r){
            int cnt = 0; // count smaller than mid
            int start = 0;
            int m = l + (r - l) / 2;
            for(int i = 0; i < n; i++){
                while(start < n && nums[i] - nums[start] > m)
                    start++;
                cnt += i - start;
            }
            if(cnt < k)
               l = m + 1;
            else
               r = m;
                
        }
        return r;
    }
}
