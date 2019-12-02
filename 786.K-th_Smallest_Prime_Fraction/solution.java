class Solution {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        int n = A.length;
        double left = 0, right = 1;
        int p = 0, q = 1;
        while(left < right){
            double mid = left + (right - left) / 2;
            int j = 0;
            int cnt = 0;
            p = 0;
            for(int i = 0; i < n; i++){
                while(j < n && A[i] > mid * A[j])
                    j++;
                cnt += n - j;
                if(j < n && p * A[j] < q * A[i]){
                    p = A[i];
                    q = A[j];
                }
            }
            if(cnt == K)
                return new int[]{p, q};
            if(cnt < K)
                left = mid;
            else
                right = mid;
        }
        return new int[]{p, q};
    }
}
