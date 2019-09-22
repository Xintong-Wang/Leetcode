class Solution{
    public int mySqrt(int x) {
        for(long i = 1; i < 46342; i++){
            if((i * i) < x){
                continue;
            }
            else if((i * i) == x){
                return (int)i;
            }
            else{
                return (int)i-1;
            }
        }
        return 0;
    }
}
