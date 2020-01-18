class Solution {
    public int partitionDisjoint(int[] A) {
        int res = 1;
        int leftMax = A[0];
        int max = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] < leftMax){
                leftMax = max;
                res = i + 1;
            }
            else{
                max = Math.max(A[i], max);
            }
        }
        return res;
    }
}
