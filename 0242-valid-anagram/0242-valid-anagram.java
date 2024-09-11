import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
      
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hashmap = new HashMap<>();

        // Count occurrences of each character in string 's'
        for (char c : s.toCharArray()) {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1); 
        }

        // Decrease the count for each character in string 't'
        for (char c : t.toCharArray()) {
            if (!hashmap.containsKey(c) || hashmap.get(c) == 0) {
                return false; 
            }
            hashmap.put(c, hashmap.get(c) - 1);
        }

        return true; 
    }
}
