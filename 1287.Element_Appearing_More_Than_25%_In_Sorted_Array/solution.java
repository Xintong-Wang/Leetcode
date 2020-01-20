class Solution {
    public int findSpecialInteger(int[] arr) {
        int ratio = arr.length / 4;
        for(int i = 0; i < arr.length - ratio; i++){
            if(arr[i] == arr[i + ratio])
                return arr[i];
        }
        return -1;
    }
}
