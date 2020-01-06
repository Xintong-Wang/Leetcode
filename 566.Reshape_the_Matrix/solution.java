class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int or = nums.length, oc = nums[0].length, row = 0, col = 0;
        int res[][] = new int[r][c]; 
        if(or == 0 || or * oc != r * c)
            return nums;
        for(int i = 0; i < or; i++){
            for(int j = 0; j < oc; j++){
                res[row][col] = nums[i][j];
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return res;
    }
}
