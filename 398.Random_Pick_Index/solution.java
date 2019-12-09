class Solution {
    private int[] arr;
    public Solution(int[] nums) {
        arr = nums;
    }
    
    Random random = new Random();
    
    public int pick(int target) {
        int s = random.nextInt(arr.length);
        int res = arr[s];
        if(res != target){
            return pick(target);
        }
        else
            return s;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
