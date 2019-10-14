class Solution {
    public boolean isPowerOfFour(int num) {
        if(num <= 0)
            return false;
        return ((num & 0xaaaaaaaa) == 0) && ((num & (num - 1)) == 0);
    }
}
