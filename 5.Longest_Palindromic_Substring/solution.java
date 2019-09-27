class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0)
            return "";
        int size = s.length();
        boolean[][] dp = new boolean[size][size];
        int left = 0, len = 1, right = 0;
        for(int i = 0; i < size; i++){
            dp[i][i] = true;
            for(int j = 0; j < i; j++){
                dp[j][i] = (s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[j + 1][i - 1]));
                if(dp[j][i] && len < i - j + 1){
                    len = i - j + 1;
                    left = j;
                    right = i + 1;
                }
            }
        }
        return s.substring(left,left + len);
    }
}
