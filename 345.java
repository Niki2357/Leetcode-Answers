class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !isVowel(str.charAt(left))) {
                left++;
            }
            while (right > left && !isVowel(str.charAt(right))) {
                right--;
            }
            char temp = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, temp);
            left++;
            right--;
        }
        return str.toString();
    }
    private boolean isVowel(char c) {
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c !='u' && c != 'A' && c != 'E' &&
            c != 'I' && c != 'O' && c != 'U') {
            return false;
        } else {
            return true;
        }
    }
}