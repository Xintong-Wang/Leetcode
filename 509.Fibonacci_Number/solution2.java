class Solution {
    public int fib(int N) {
        int f = 0, g = 1;
        while(N-- > 0){
            g = f + g;
            f = g - f;
        }
        return f;
    }
}
