class Solution {
    public int maxChunksToSorted(int[] arr) {
        int flag = 0;
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            flag = Math.max(flag, arr[i]);
            if(flag == i)
                res++;
        }
        return res;
    }
}
