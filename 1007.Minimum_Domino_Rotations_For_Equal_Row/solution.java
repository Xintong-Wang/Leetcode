class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int res = -1;
        for(int target = 1; target <= 6; target++){
            boolean flag = true;
            int countA = 0;
            int countB = 0;
            for(int i = 0; i < A.length; i++){
                if(A[i] != target && B[i] != target){
                    flag = false;
                    break;
                }
                else if(A[i] == target && B[i] == target){
                    countA++;
                    countB++;
                }
                else if(A[i] == target)
                    countA++;
                else if(B[i] == target)
                    countB++;
            }
            if(flag)
                res = A.length - Math.max(countA, countB);
        }
        return res;
    }
}
