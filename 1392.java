class Solution {
    public String longestPrefix(String s) {
        int length = s.length() - 1;
        int preHash = 0;
        int sufHash = 0;
        String out = "";
        int power = 1;
        for (int i = 0; i < length; i++) {
            preHash = preHash * 113 + s.charAt(i);
            sufHash = s.charAt(length - i) * power + sufHash;
            if (preHash == sufHash) {
                out = s.substring(0, i + 1);
            }
            power *= 113;
        }
        return out;
    }
}