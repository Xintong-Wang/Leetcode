class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (o1, o2) ->{
            String[] split1 = o1.split(" ", 2);
            String[] split2 = o2.split(" ", 2);
            boolean isletter1 = Character.isLetter(split1[1].charAt(0));
            boolean isletter2 = Character.isLetter(split2[1].charAt(0));
            if(isletter1 && isletter2){
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
            return isletter1 ? -1 : (isletter2 ? 1 : 0);
        });
        return logs;
    }
}

