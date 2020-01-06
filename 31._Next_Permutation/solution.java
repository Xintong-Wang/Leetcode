class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2, j = n - 1;
        for(; i >= 0; i--){
            if(nums[i + 1] > nums[i]){
                for(; j > i; j--){
                    if(nums[j] > nums[i])
                        break;
                }
                swap(nums, i, j);
                reverse(nums, i + 1, n - 1);
                return;
            }
        }
        reverse(nums, 0, n - 1);
    }
    private void swap(int[] nums, int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    private void reverse(int[] nums, int start, int end){
        while(start <= end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

