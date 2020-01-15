class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        HashSet<String> pass = new HashSet();
        HashSet<String> noPass = new HashSet();
        int res = 0;
        for(String word : words){
            if(pass.contains(word)){
                res++;
                continue;
            }else if(noPass.contains(word)){
                continue;
            }
            else{
                int len = word.length(), i = 0;
                for(int k = 0; k < S.length(); k++){
                    if(word.charAt(i) == S.charAt(k)){
                        i++;
                        if(i == len){
                            break;
                        }
                    }
                }
                if(i == len){
                    res++;
                    pass.add(word);
                    // for(int j = 1; j < word.length(); j++){
                    //     pass.add(word.substring(0, j));
                    // }
                }else{
                    noPass.add(word);
                }
            }
        }
        return res;
    }
}
