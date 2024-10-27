class Solution {
    public int findPermutationDifference(String s, String t) {
        int diff = 0;
        int n = s.length();

    
        int[] sIndex = new int[26];
        int[] tIndex = new int[26]; 


        for (int i = 0; i < n; i++) {
            sIndex[s.charAt(i) - 'a'] = i; 
            tIndex[t.charAt(i) - 'a'] = i; 
        }


        for (char c : s.toCharArray()) {
            diff += Math.abs(sIndex[c - 'a'] - tIndex[c - 'a']);
        }

        return diff;
    }
}
