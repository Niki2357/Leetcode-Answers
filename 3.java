class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> map = new HashSet<Character>();
        int length = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char newChar = s.charAt(right);
            if (map.contains(newChar)) {
                while (map.contains(newChar)) {
                    map.remove(s.charAt(left));
                    left++;
                    
                }
                map.add(newChar);
                
            } else {
                map.add(newChar);
                if (map.size() > length) {
                    length = map.size();
                }
                
            }
            right++;
        }
        return length;
    }
}