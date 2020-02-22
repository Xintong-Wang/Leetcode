class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int res1 = 0, res2 = 0, temp = 0;
        for(int i = 0; i <= cost.length - 1; i++){
            temp = cost[i] + Math.min(res1, res2);
            res2 = res1;
            res1 = temp;
        }
        return Math.min(res1, res2);
    }
}
