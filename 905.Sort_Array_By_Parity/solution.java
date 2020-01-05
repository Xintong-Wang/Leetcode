class Solution {
    public int[] sortArrayByParity(int[] A) {
        int right = A.length - 1, left = 0, i = 0;
        int[] res = new int[right + 1];
        while(left <= right){
            if(A[i] % 2 == 0){
                res[left] = A[i];
                left++;
            }
            else{
                res[right] = A[i];
                right--;
            }
            i++;
        }
        return res;
    }
}
