class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int temp = sum;
        for(int i = k; i < nums.length; i++){
            temp -= nums[i - k];
            temp += nums[i];
            if(temp > sum)
                sum = temp;
        }
        return (double) sum/k;
    }
}
