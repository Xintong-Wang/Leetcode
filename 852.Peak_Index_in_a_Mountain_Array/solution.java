class Solution {
    public int peakIndexInMountainArray(int[] A) {
        if(A.length < 3)
            return 0;
        for(int i = 1; i < A.length; i++){
            if(A[i - 1] > A[i])
                return i - 1;
        }
        return 0;
    }
}
