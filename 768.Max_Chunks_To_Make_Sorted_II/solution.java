class Solution {
    public int maxChunksToSorted(int[] arr) {
        int res = 1;
        int n = arr.length;
        int[] min = new int[n];
        int[] max = new int[n];
        int flag = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            flag = Math.max(flag, arr[i]);
            min[i] = flag;
        }
        flag = Integer.MAX_VALUE;
        for(int i = n - 1; i >= 0; i--){
            flag = Math.min(flag, arr[i]);
            max[i] = flag;
        }
        for(int i = 0; i < n - 1; i++){
            if(min[i] <= max[i + 1])
                res++;
        }
        return res;
    }
}

