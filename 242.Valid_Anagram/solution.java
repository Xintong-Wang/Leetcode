class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] letter = new int[26];
        for(char c : s.toCharArray()){
            letter[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            letter[c - 'a']--;
        }
        for(int cnt : letter){
            if(cnt != 0)
                return false;
        }
        return true;
    }
}

