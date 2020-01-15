class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int row = matrix.length;
        int left = matrix[0][0], right = matrix[row - 1][row - 1];
        while(left < right){
            int mid = left + (right - left) / 2;
            int count = 0;
            int j = row - 1;
            for(int i = 0; i < row; i++){
                while(j >= 0 && matrix[i][j] > mid)
                    j--;
                count += j + 1;
            }
            if(count < k)
                left = mid + 1;
            else
                right = mid;
        }
        return right;
    }
}
