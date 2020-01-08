class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int sum = 0, res = 0;
        int[] counts = new int[A.length + 1];
        counts[0] = 1;
        for(int i = 0; i < A.length; i++){
            sum += A[i];
            if(sum >= S){
                res += counts[sum - S];
            }
            counts[sum]++;
        }
        return res;
    }
}



