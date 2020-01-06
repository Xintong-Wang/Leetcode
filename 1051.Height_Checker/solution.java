class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] copy = heights.clone();
        Arrays.sort(heights);
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != copy[i])
                res++;
        }
        return res;
    }
}
