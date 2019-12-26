class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        int len = S.length();
        List<List<Integer>> res = new ArrayList();
        int c = 0;
        for(int i = 1; i <= len; i++){ 
            if(i == len || S.charAt(i) != S.charAt(i - 1)){
                if(c > 1)
                    res.add(Arrays.asList(new Integer[]{i - c - 1,i - 1}));
                c = 0;
            }
            else
                c++;
        }
        return res;
    }
}
