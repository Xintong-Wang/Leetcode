class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            if(!set.contains(nums1[i]))
                set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                arr.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] res = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}
