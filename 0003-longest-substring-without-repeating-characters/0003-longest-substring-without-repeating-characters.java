class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> str = new HashSet<>();

        int slow = 0 ;
        int fast = 0 ;
        int longest = 0 ;

        while(fast < s.length()){
            if(str.add(s.charAt(fast))){
                longest = Math.max(longest , fast - slow + 1 );
                fast++ ;
            }else {
                str.remove(s.charAt(slow));
                slow++ ;
            }
        }

        return longest ;

    }
}
