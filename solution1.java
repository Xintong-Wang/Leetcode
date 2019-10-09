class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        int i = ((n - 1) & n);
        if(i == 0)
            return true;
        return false;
    }
}
