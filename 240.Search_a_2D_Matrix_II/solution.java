class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int horiLen = matrix[0].length, verLen = matrix.length;
        if(target < matrix[0][0] || target > matrix[verLen - 1][horiLen - 1])
            return false;
        int x = 0, y = horiLen - 1;
        while(true){
            if(target < matrix[x][y]){
                y -= 1;
            }
            else if(target > matrix[x][y]){
                x += 1;
            }
            else
                return true;
            if(x >= verLen || y < 0)
                break;
        }
        return false;
    }
}
