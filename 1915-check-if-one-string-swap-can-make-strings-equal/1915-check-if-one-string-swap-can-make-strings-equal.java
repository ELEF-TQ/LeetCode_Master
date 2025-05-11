class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int diffCount = 0;
        int first = -1;
        int second = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;

                if (diffCount > 2) return false;

                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        // no diffrences -> indentical
        if (diffCount == 0) return true;

        // 2 differences -> check swap
        return diffCount == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);

    }
}
