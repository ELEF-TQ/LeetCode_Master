class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }

    
        for (int i = 0; i < words.length - 1; i++) {
            if (!compare(words[i], words[i + 1], orderMap)) {
                return false;
            }
        }
        return true;
    }


    private boolean compare(String word1, String word2, int[] orderMap) {
        int len = Math.min(word1.length(), word2.length());
        
        for (int i = 0; i < len; i++) {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);
            
            if (char1 != char2) {
                return orderMap[char1 - 'a'] < orderMap[char2 - 'a'];
            }
        }
        // the shorter word should come first.
        return word1.length() <= word2.length();
    }
}
