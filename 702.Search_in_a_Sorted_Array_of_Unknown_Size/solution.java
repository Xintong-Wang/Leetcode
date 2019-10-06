class Solution {
    public int search(ArrayReader reader, int target) {
        int lo = 0, hi = 9999;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            int res = reader.get(mid);
            if(res == 2147483647)
                hi = mid - 1;
            else if(res < target)
                lo = mid + 1;
            else if(res > target)
                hi = mid - 1;
            else 
                return mid;
        }
        return -1;
    }
}
