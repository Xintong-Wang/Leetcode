class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int[] dp = new int[envelopes.length];
        int len = 0;
        Arrays.sort(envelopes, (a, b) -> {
            if(a[0] < b[0]) {
                return -1;
            }
            else if(a[0] == b[0]) {
                if(a[1] < b[1]){
                    return 1;
                }
                else{
                    return -1;
                }
            }else{
                return 1;
            }
        }); 
        for(int i = 0; i < envelopes.length; ++i) {
            int left = 0, right = len;
            int h = envelopes[i][1];
            while(left < right){
                int mid = left + (right - left) / 2;
                if (dp[mid] < h) 
                    left = mid + 1;
                else 
                    right = mid;
            }
            if (right >= len){
                dp[len] = h;
                len++;
            }
            else 
                dp[right] = h;
        }
        return len;
    }
}
