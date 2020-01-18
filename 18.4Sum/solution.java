class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 4)
            return res;
        int n = nums.length;
        for(int i = 0; i < n - 3; i++){
            if(i >= 1 && nums[i - 1] == nums[i])
                continue;
            if(nums[i] * 4 > target)
                break;
            if(nums[i] + nums[n - 1] * 3 < target)
                continue;
            for(int j = i + 1; j < n - 2; j++){
                if(j >= i + 2 && nums[j - 1] == nums[j])
                    continue;
                if(nums[i] + nums[j] * 3 > target)
                    break;
                if(nums[i] + nums[j] + nums[n - 1] * 2 < target)
                    continue;
                int left = j + 1, right = n - 1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] +nums[right];
                    if(sum > target)
                        right--;
                    else if(sum < target)
                        left++;
                    else{
                        if(left == j + 1 || nums[left] != nums[left - 1]){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[left]);
                            temp.add(nums[right]);
                            res.add(temp);
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
