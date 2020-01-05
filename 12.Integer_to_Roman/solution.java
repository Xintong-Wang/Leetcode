class Solution {
    public String intToRoman(int num) {
        String[] s1 = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] s2 = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] s3 = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] s4 = new String[]{"", "M", "MM", "MMM"};
        return s4[num / 1000] + s3[num % 1000 / 100] + s2[num % 100 / 10] + s1[num % 10];
    }
}
