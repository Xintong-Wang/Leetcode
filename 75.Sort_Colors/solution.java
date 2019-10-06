class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int red = 0, white = 0, blue = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == 0)
                red++;
            else if(nums[i] == 1)
                white++;
            else
                blue++;
        }
        for(int i = 0; i < len; i++){
            if(i < red)
                nums[i] = 0;
            else if(i >= red && i < red + white)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
}
