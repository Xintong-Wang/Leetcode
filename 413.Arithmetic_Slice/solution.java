class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int res = 0;
        for(int i = 0; i < A.length - 2; i++){
            int gap = A[i + 1] - A[i];
            for(int j = i + 2; j < A.length; j++){
                if(A[j] - A[j - 1] == gap)
                    res++;
                else
                    break;
            }
        }
        return res;
    }
}
