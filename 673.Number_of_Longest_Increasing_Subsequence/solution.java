class Solution {
    public int findNumberOfLIS(int[] nums) {
        int res = 0, len = nums.length, flag = 0;
        int[] cnt = new int[len];
        int[] end = new int[len];
        for(int i = 0; i < len; i++){
            cnt[i] = 1;
            end[i] = 1;
        }
        for(int i = 0; i < len; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] <= nums[j])
                    continue;
                if(end[i] == end[j] + 1)
                    cnt[i] += cnt[j];
                else if(end[i] < end[j] + 1){
                    end[i] = end[j] + 1;
                    cnt[i] = cnt[j];
                }
            }
            if(flag == end[i])
                res += cnt[i];
            else if(flag < end[i]){
                flag = end[i];
                res = cnt[i];
            }
        }
        return res;
    }
}
