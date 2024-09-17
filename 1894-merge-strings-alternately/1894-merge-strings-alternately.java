class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder merged = new StringBuilder();
        int p1 = 0 ;
        int p2 = 0 ;

        while(p1 < word1.length() && p2 < word2.length()){
            merged.append(word1.charAt(p1++));
            merged.append(word2.charAt(p2++));
        }

        // remaining word1
        while(p1 < word1.length()){
            merged.append(word1.charAt(p1++));
        }

         // remaining word2
        while(p2 < word2.length()){
            merged.append(word2.charAt(p2++));
        }

        return merged.toString();

    }
}