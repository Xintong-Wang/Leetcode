class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int x = grid.length, y = grid[0].length;
        int res = 0;
        for(int i = 0; i < x - 2; i++){
            for(int j = 0; j < y - 2; j++){
                if(grid[i + 1][j + 1] == 5 && isValid(grid, i, j))
                    res++;
            }
        }
        return res;
    }
    private boolean isValid(int[][] grid, int x, int y){
        Set set = new HashSet();
        for(int i = x; i < x + 2; i++){
            for(int j = y; j < y + 2; j++){
                int val = grid[i][j];
                if(val > 9 || val < 1 || set.contains(val))
                    return false;
                set.add(val);
            }
        }
        if(grid[x][y] + grid[x + 1][y] + grid[x + 2][y] != 15)
            return false;
        if(grid[x][y + 1] + grid[x + 1][y + 1] + grid[x + 2][y + 1] != 15)
            return false;
        if(grid[x][y + 2] + grid[x + 1][y + 2] + grid[x + 2][y + 2] != 15)
            return false;
        if(grid[x][y] + grid[x][y + 1] + grid[x][y + 2] != 15)
            return false;
        if(grid[x + 1][y] + grid[x + 1][y + 1] + grid[x + 1][y + 2] != 15)
            return false;
        if(grid[x + 2][y] + grid[x + 2][y + 1] + grid[x + 2][y + 2] != 15)
            return false;
        if(grid[x][y] + grid[x + 1][y + 1] + grid[x + 2][y + 2] != 15)
            return false;
        return true;
    }
}
