class Solution {
    public int maxRotateFunction(int[] A) {
        int sum = 0, f = 0, res = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i];
            f += i * A[i];
        }
        res = f;
        for(int i = 0; i < A.length; i++){
            f = f + sum - A.length * A[A.length - i - 1];
            if(f > res)
                res = f;
        }
        return res;
    }
}
