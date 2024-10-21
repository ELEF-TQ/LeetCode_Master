import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false ;

        HashMap<Character,Integer> characters = new HashMap<>();

        for (char c : s.toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1); 
        }
        
        for (char c : t.toCharArray()) {
            if (!characters.containsKey(c) || characters.get(c) == 0) {
                return false; 
            }
            characters.put(c, characters.get(c) - 1);
        }

        return true ;

      
      
    }
}
