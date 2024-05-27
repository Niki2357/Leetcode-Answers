class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;

        int tempCount = 0;
        boolean wasVowel = isVowel(s.charAt(0));
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                tempCount++;
            }
        }
        int max = tempCount;
        while (left < s.length() - k) {
            if (wasVowel) {
                tempCount--;
            }
            if (isVowel(s.charAt(left + k))) {
                tempCount++;
            }
            if (isVowel(s.charAt(++left))) {
                wasVowel = true;
            } else {
                wasVowel = false;
            }
            if (tempCount > max) {
                max = tempCount;
            }
            if (max == k) {
                return max;
            }
        }
        return max;
    }
    private boolean isVowel(char c) {
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            return false;
        }
        return true;
    }
}