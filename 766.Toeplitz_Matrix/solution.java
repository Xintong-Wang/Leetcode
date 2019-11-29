class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        for(int i = 1; i < x; i++){
            int[] arr1 = new int[y - 1];
            int[] arr2 = new int[y - 1];
            arr1 = Arrays.copyOfRange(matrix[i - 1], 0, y - 1);
            arr2 = Arrays.copyOfRange(matrix[i], 1, y);
            if(Arrays.equals(arr1, arr2))
                continue;
            else
                return false;
        }
        return true;
    }
}
