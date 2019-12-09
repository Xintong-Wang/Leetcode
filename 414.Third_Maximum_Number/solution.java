class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num: nums)
            if(set.add(num) && set.size() > 3)
                set.pollFirst();
        return set.size() > 2 ? set.pollFirst() : set.pollLast();
    }
}
