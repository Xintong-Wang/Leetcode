class Solution {
    public int[] dailyTemperatures(int[] T) {
        for(int i = 0; i < T.length; i++){
            for(int j = i; j < T.length; j++){
                if(T[j] > T[i]){
                    T[i] = j - i;
                    break;
                }
                else if(j == T.length - 1)
                    T[i] = 0;
            }
        }
        return T;
    }
}
