class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        res[T.length - 1] = 0;
        int flag = T.length - 2;
        while(flag >= 0){
            if(T[flag] < T[flag + 1]){
                res[flag] = 1;
                flag--;
            }
            else{
                int j = flag + 1;
                while(res[j] != 0){
                    j += res[j];
                    if(T[j] > T[flag]){
                        res[flag] = j - flag;
                        break;
                    }
                }
                flag--;
            }
        }
        return res;
    }
}
