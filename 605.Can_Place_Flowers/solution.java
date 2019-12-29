class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0, con = 0, front = 0, tail = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                cnt += i / 2;
                front = i;
                break;
            }
            if(i == flowerbed.length - 1 )
                return (flowerbed.length + 1) / 2 >= n;
        }
        for(int i = flowerbed.length - 1; i >= 0; i--){
            if(flowerbed[i] == 1){
                cnt += (flowerbed.length - i - 1) / 2;
                tail = i;
                break;
            }
        }
        for(int i = front; i <= tail; i++){
            if(flowerbed[i] == 0){
                con++;
            }
            else{
                if(con >= 3){
                    cnt += (con - 1) / 2;
                }
                con = 0;
            }
            if(cnt >= n)
                return true;
        }
        return false;
    }
}
