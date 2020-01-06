class Solution {
    public boolean validMountainArray(int[] A) {
        boolean flag = true;
        if(A.length <= 2)
            return false;
        for(int i = 1; i < A.length; i++){
            if(flag){
                if(A[i - 1] < A[i])
                    continue;
                else if(A[i - 1] > A[i])
                    flag = false;
                else
                    return false;
            }
            if(i == 1 && !flag)
                return false;
            else{
                if(A[i - 1] > A[i])
                    continue;
                else
                    return false;
            }
        }
        if(flag)
            return false;
        return true;
    }
}
