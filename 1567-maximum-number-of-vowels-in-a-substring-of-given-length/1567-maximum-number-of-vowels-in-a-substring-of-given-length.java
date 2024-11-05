class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;
        
        // A set of vowels for fast lookup
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        // First window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
        }
        
        maxVowels = currentVowels;
        
        // Sliding window
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
            if (vowels.contains(s.charAt(i - k))) {
                currentVowels--;
            }
            
            maxVowels = Math.max(maxVowels, currentVowels);
        }
        
        return maxVowels;
    }
}
