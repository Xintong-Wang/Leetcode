class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp= new int[n][n];
        return print(dp, s.toCharArray(), 0, n - 1);
    }
    private int print(int[][] dp, char[] s, int l, int r){
        if(l > r)
            return 0;
        if(dp[l][r] > 0)
            return dp[l][r];
        int res = print(dp, s, l, r - 1) + 1;
        for(int i = l; i < r; i++){
            if(s[i] == s[r])
                res = Math.min(res, print(dp, s, l, i) + print(dp, s, i + 1, r - 1));
        }
        return dp[l][r] = res;
    }
}  

