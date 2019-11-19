class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ' ';
        Set<String> ban = new HashSet();
        for(int i = 0; i < banned.length; i++){
            ban.add(banned[i]);
        }
        Map<String, Integer> strCnt = new HashMap();
        int max = 0;
        String result = "";
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < paragraph.length(); i++){
            char temp = paragraph.charAt(i);
            if (Character.isLetter(temp)){
                word.append(Character.toLowerCase(temp));
            }
            else if (word.length() > 0){
                String para = word.toString();
                if (!ban.contains(para)){
                    if(strCnt.containsKey(para)){
                        strCnt.put(para, strCnt.get(para) + 1);
                    }
                    else{
                        strCnt.put(para, 1);
                    }
                    if (strCnt.get(para) > max){
                        max = strCnt.get(para);
                        result = para;
                    }
                }
                word = new StringBuilder();
            }
        }
        return result;
    }
}


