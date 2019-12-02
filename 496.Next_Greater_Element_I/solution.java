class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int pos = nums2.length;
            int j;
            for(j = 0; j < nums2.length; j++){
                if(nums2[j] == nums1[i] && j == nums2.length - 1){
                    res[i] = -1;
                    break;
                }
                if(nums2[j] == nums1[i]){
                    pos = j;
                }
                if(nums2[j] > nums1[i] && j > pos){
                    res[i] = nums2[j];
                    break;
                }
            }
            if(j == nums2.length)
                res[i] = -1;
        }
        return res;
    }
}

