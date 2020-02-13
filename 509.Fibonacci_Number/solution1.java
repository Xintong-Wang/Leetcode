class Solution {
    public int fib(int N) {
        if(N <= 1)
            return N;
        int[] res = new int[N + 1];
        res[0] = 0;
        res[1] = 1;
        int i = 1;
        while(i != N){
            i++;
            res[i] = res[i - 1] + res[i - 2]; 
        }
        return res[i];
    }
}
