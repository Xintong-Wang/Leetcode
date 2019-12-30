class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int begin, int ends){
        for(; begin < ends; begin++, ends--){
            int temp = nums[begin];
            nums[begin] = nums[ends];
            nums[ends] = temp;
        }
    }
}
