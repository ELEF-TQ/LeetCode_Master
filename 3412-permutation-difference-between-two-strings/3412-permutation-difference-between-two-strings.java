class Solution {
    public int findPermutationDifference(String s, String t) {

        int diff = 0 ;
        int n = s.length() ;
        

        HashMap<Character,Integer> Shash = new HashMap<>();
        HashMap<Character,Integer> Thash = new HashMap<>();

        for(int i=0 ; i < n ; i++){
            Shash.put(s.charAt(i) , i);
             Thash.put(t.charAt(i) , i);
        }

        for(char c:s.toCharArray()){
            diff += (Math.abs(Shash.get(c) - Thash.get(c)));
        }

        return diff ;
        
    }
}