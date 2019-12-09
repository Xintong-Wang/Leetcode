class Solution {
    public int maxRotateFunction(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        int res = Integer.MIN_VALUE;
        int[] arr = new int[2 * A.length];
        for(int i = 0; i < 2 * A.length; i++){
            if(i < A.length)
                arr[i] = A[i];
            else
                arr[i] = A[i - A.length];
        }
        for(int i = 0; i < A.length; i++){
            int ans = 0;
            for(int j = i, k = 0; k < A.length; j++, k++){
                ans += k * arr[j];
            }
            if(ans > res)
                res = ans;
        }
        return (int)res;
    }
}
