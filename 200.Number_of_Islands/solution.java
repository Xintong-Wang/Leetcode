class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
            return 0;
        int row = grid.length, col = grid[0].length;
        int res = 0;
        int[][] visited = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '0' || visited[i][j] == 1)
                    continue;
                else{
                    visit(visited, grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    private void visit(int[][] visited, char[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= visited.length || col >= visited[0].length || visited[row][col] == 1 || grid[row][col] == '0')
            return;
        visited[row][col] = 1;
        visit(visited, grid, row + 1, col);
        visit(visited, grid, row, col + 1);
        visit(visited, grid, row - 1, col);
        visit(visited, grid, row, col - 1);
    }
}
