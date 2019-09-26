class Solution {
    public int hIndex(int[] citations) {
        int left = 0, right = citations.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(citations[mid] == citations.length - mid){
                return citations.length - mid;
            }
            else if(citations[mid] > citations.length - mid){
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return citations.length - left;
    }
}
