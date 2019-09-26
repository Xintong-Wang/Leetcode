class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int temp = 0;
        for(int i = 0; i < citations.length / 2; i++){
            temp = citations[i];
            citations[i] = citations[citations.length - 1 - i];
            citations[citations.length - 1 - i] = temp;
        }
        for(int i = 0; i < citations.length; i++){
            if(i >= citations[i])
                return i;
        }
        return citations.length;
    }
}
