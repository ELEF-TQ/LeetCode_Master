import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;  
        }
 
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        if (!freq1.keySet().equals(freq2.keySet())) {
            return false;  
        }

        // Count frequencies of frequencies
        Map<Integer, Integer> freqCount1 = new HashMap<>();
        Map<Integer, Integer> freqCount2 = new HashMap<>();

        for (int count : freq1.values()) {
            freqCount1.put(count, freqCount1.getOrDefault(count, 0) + 1);
        }
        for (int count : freq2.values()) {
            freqCount2.put(count, freqCount2.getOrDefault(count, 0) + 1);
        }

      
        return freqCount1.equals(freqCount2);
    }
}
