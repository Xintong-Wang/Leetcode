class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if(n1 > n2)
            return findMedianSortedArrays(nums2, nums1);
        int l = 0, r = n1;
        int k = (n1 + n2 + 1) / 2;
        while(l < r){
            int f1 = l + (r - l) / 2, f2 = k - f1 - 1;
            if(nums1[f1] < nums2[f2])
                l = f1 + 1;
            else
                r = f1;
        }
        int f1 = l, f2 = k - l;
        int r1 = Math.max(f1 <= 0? Integer.MIN_VALUE : nums1[f1 - 1], f2 <= 0? Integer.MIN_VALUE : nums2[f2 - 1]);
        int r2 = Math.min(f1 >= n1? Integer.MAX_VALUE : nums1[f1], f2 >= n2? Integer.MAX_VALUE : nums2[f2]);
        return (n1 + n2) % 2 == 1 ? r1 : (r1 + r2) * 0.5;
    }
}
