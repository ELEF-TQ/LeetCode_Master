class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character , Integer> counts = new HashMap<>();
        int length = 0 ;
        boolean hasOdd = false ;

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

    

        for(int count : counts.values()){
            if(count % 2 != 0) hasOdd = true ; // any caract that is odd

            length += (count/2)*2 ; // largest even part

        }

        return length + (hasOdd ? 1 : 0) ; // we can contribure only with one odd


        
    }
}