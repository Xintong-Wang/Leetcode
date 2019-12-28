class Solution {
    public int[][] transpose(int[][] A) {
        int x = A.length, y = A[0].length;
        int[][] res = new int[y][x];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
