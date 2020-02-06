class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int x = matrix.length;
        int y = matrix[0].length;
        int res = 0;
        int[][] dp = new int[x + 1][y + 1];
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++){
                if(matrix[i - 1][j - 1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j -1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                    res = Math.max(dp[i][j], res);
                }
            }
        }
        return res * res;
    }
}
