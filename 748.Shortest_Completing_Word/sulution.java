class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        String res = "";
        Map letter = new HashMap<Character, Integer>();
        for(int i = 0; i < licensePlate.length(); i++){
            if(licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z'){
                if(letter.containsKey(licensePlate.charAt(i))){
                    letter.put(licensePlate.charAt(i), (int)letter.get(licensePlate.charAt(i)) + 1);
                }
                else{
                    letter.put(licensePlate.charAt(i), 1);
                }
            }
        }
        for(String word : words){
            HashMap perword = new HashMap<Character, Integer>();
            perword.putAll(letter);
            for(char l : word.toCharArray()){
                if(perword.containsKey(l)){
                    if((int)perword.get(l) == 1)
                        perword.remove(l);
                    else
                        perword.put(l, (int)perword.get(l) - 1);
                }
            }        
            if(perword.size() == 0 && (res.isEmpty() || word.length() < res.length())){
                res = word;
            }
        }
        return res;
    }
}
