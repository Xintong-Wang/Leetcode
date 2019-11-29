// class Solution {
//     public double[] medianSlidingWindow(int[] nums, int k) {
//         int n = nums.length;
//         double[] res = new double[n - k + 1];
//         if(n == 0 || k == 0)
//             return new double[0];
//         for(int i = 0; i < n - k + 1; i++){
//             int[] arr = Arrays.copyOfRange(nums, i, i + k);
//             Arrays.sort(arr);
//             if(k % 2 == 0){
//                 res[i] = ((double)arr[k / 2 - 1] + (double)arr[k / 2]) / 2;
//             }
//             else
//                 res[i] = (double)arr[k / 2];
//         }
//         return res;
//     }
// }

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] res = new double[n - k + 1];
        if(n == 0 || k == 0)
            return new double[0];
        int[] arr = Arrays.copyOfRange(nums, 0, k);
        Arrays.sort(arr);
        for(int i = 1; i < n - k + 1; i++){
            res[i - 1] = k % 2 == 0 ? ((double)arr[k / 2 - 1] + (double)arr[k / 2]) / 2 : (double)arr[k / 2];
            arr = median(arr, nums[i - 1], nums[i + k - 1], k);
        }
        res[n - k] = k % 2 == 0 ? ((double)arr[k / 2 - 1] + (double)arr[k / 2]) / 2 : (double)arr[k / 2];
        return res;
    }
    private int[] median(int[] arr, int move, int add, int k){
        int i = 0;
        while(i < k && arr[i] != move){
            i++;
        }
        while(i < k - 1){
            arr[i] = arr[i + 1];
            i++;
        }
        i = 0;
        while(i < k - 1 && arr[i] < add) {
            i++;
        }
        int j = k - 1;
        while(j > i){
            arr[j] = arr[j - 1];
            j--;
        }
        arr[j] = add;
        return arr;
    }
}
