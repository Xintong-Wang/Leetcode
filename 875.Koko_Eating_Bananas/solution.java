class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1, right = 0;
        for(int i : piles)
            if(i > right)
                right = i;
        while(left < right){
            int mid = left + (right - left) / 2;
            int count = 0;
            for(int i : piles)
                count += (mid + i - 1) / mid;
            if(count > H)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
