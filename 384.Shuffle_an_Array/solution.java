class Solution {
    private int[] array;
    private int[] original;
    
    private void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;       
    }
    
    private int random(int min, int max){
        Random random = new Random();
        int s = random.nextInt(max - min) + min;
        return s;
    }

    public Solution(int[] nums) {
        array = nums;
        original = array.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i = 0; i < array.length; i++){
            swap(i, random(i, array.length));
        }
        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
