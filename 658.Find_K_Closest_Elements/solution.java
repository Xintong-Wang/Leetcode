class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(x - arr[mid] > arr[mid + k] - x)
                left = mid + 1;
            else
                right = mid;
        }
        return arrayToList(arr, left, right + k);
    }
    public List<Integer> arrayToList(int[] arr, int left, int right){
        List<Integer> res = new ArrayList<>();
        for(int i = left; i < right; i++){
            res.add(arr[i]);
        }
        return res;
    }
}
