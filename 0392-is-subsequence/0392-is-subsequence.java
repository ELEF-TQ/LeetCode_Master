class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0 ;
        int tPointer = 0 ;

        while(tPointer < t.length()){
            if(sPointer == s.length()) return true ;
            if(s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++ ;
                tPointer++ ;
            } else {
                tPointer++;
            }
        }

        return sPointer == s.length() ;




    }
}