import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!map.containsKey(c)) {
                // word is already mapped to another character
                if (map.containsValue(word)) return false;
                
                // addt the key and the word
                map.put(c, word);
            } else {
                // word doesn't match
                if (!map.get(c).equals(word)) return false;
            }
        }

        return true;
    }
}
