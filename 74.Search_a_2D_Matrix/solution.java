class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int midM = mid / n;
            int midN = mid % n;
            if(matrix[midM][midN] == target){
                return true;
            }
            else if(matrix[midM][midN] > target){
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return false;
    }
}
