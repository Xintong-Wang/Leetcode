class Solution {
    public int findKthNumber(int m, int n, int k) {
        int left = 0, right = m * n;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(greater(m, n, mid) >= k)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
    private int greater(int m, int n, int mid){
        int count = 0;
        for(int i = 1; i <= m; i++){
            count += Math.min(n, mid / i);
        }
        return count;
    }
}
