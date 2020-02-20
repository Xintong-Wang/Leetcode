class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] queens = new int[n];
        setQueens(0, res, n, queens);
        return res;
    }
    
    private void setQueens(int curRow, List<List<String>> res, int n, int[] queens){
        if(curRow == n){
            List<String> sol = new ArrayList<>();
            char[] row = new char[n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(queens[i] == j)
                        row[j] = 'Q';
                    else
                        row[j] = '.';
                }
                sol.add(new String(row));
            }
            res.add(sol);
        }
        for(int i = 0; i < n; i++){
            if(isValid(i, queens, curRow)){
                queens[curRow] = i;
                setQueens(curRow + 1, res, n, queens);
            }
        }
    }
    
    private boolean isValid(int pos, int[] queens, int curRow){
        for(int i = 0; i < curRow; i++){
            if(pos == queens[i] || (Math.abs(queens[i] - pos) == Math.abs(i - curRow)))
                return false;
        }
        return true;
    }
}
