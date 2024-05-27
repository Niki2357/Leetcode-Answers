class Solution {
    public int compress(char[] chars) {
        char curChar;
        int left = 0;
        int right = 0;
        int count;
        int out = 0;
        while (left < chars.length) {
            curChar = chars[left];
            right = left + 1;
            count = 1;
            while (right < chars.length) {
                if (chars[right] == curChar) {
                    count++;
                    right++;
                } else {
                    break;
                }
            }
            if (count == 1) {
                chars[out] = chars[left];
                out++;
            } else {
                chars[out] = chars[left];
                out++;
                    for (final char c : String.valueOf(count).toCharArray()) {
                        chars[out++] = c;
                    }
            }
            left = right;
        }
        return out;
    }
}