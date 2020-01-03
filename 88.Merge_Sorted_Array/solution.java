class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n -= 1;
        int k = m - 1;
        m += n;
        while(n >= 0){
            nums1[m--] = (k >= 0 && nums1[k] >nums2[n]) ? nums1[k--] : nums2[n--];
        }
    }
}
