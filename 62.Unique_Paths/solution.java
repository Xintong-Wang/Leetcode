class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return dfs(m - 1, n - 1, dp);
    }
    private int dfs(int x, int y, int[][] dp){
        if(x == 0 && y == 0)
            return 1;
        if(x < 0 || y < 0)
            return 0;
        if(dp[x][y] > 0)
            return dp[x][y];
        dp[x][y] = dfs(x - 1, y, dp) + dfs(x, y - 1, dp);
        return dp[x][y];
    }
}
