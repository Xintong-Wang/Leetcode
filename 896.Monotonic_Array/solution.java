class Solution {
    public boolean isMonotonic(int[] A) {
        boolean flag = true;
        int i = 1;
        for(; i < A.length; i++){
            if(A[i - 1] < A[i]){
                break;
            }
            else if(A[i - 1] > A[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            for(; i < A.length; i++){
                if(A[i - 1] > A[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            for(; i < A.length; i++){
                if(A[i - 1] < A[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
