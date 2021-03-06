class Solution{
    public int mySqrt(int x){
        long left = 0;
        long right = x/2 + 1;
        while(left <= right){
            long mid = (left + right) / 2;
            long sqrt = mid * mid;
            if(sqrt == x){
                return (int)mid;
            }
            else if(sqrt < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return (int)right;
    }
}//二分法
