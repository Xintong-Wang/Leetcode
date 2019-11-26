class NumArray {
    private int[] data;

    public NumArray(int[] nums) {
        data = nums;
    }
    
    public void update(int i, int val) {
        data[i] = val;
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        for(int p = i; p <= j; p++){
            sum += data[p];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
