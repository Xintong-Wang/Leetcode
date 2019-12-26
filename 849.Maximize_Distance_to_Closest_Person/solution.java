class Solution {
    public int maxDistToClosest(int[] seats) {
        int counts = 0;
        int pre = -1;
        for(int i = 0; i < seats.length; ++i){
            if(i == seats.length - 1 && seats[i] != 1){
                counts = Math.max(counts, seats.length - pre - 1);
            }
            else if(seats[i] == 1){
                if(pre == -1){
                    counts = i;
                    pre = i;
                }
                else{
                    counts = Math.max((i - pre) / 2, counts);
                    pre = i;
                }
            }
        }
        return counts;
    }
}
