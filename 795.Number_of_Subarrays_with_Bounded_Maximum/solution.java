class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int left = -1, right = -1, res = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > R){
                left = right = i;
                continue;
            }
            if(A[i] >= L){
                right = i;
            }
            res += right - left;
        }
        return res;
    }
}
