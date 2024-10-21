import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hashSet = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                right++;
                maxLength = Math.max(right - left, maxLength);
            } else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
