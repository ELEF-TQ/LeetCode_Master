class Solution {
    public String longestPalindrome(String s) {

        if(s.length() < 2) return s ;

        String maxStr = "";

        for(int i=0 ; i < s.length() ; i++){
            String odd = expandFromCenter(s,i,i);
            String even = expandFromCenter(s,i,i+1);
            String longer = odd.length() > even.length() ? odd : even ;

            if(longer.length() > maxStr.length()){
                maxStr = longer ;
            }
        }

        return maxStr ;

    }

    private String expandFromCenter(String s , int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left-- ;
            right++ ;
        }

        // left and right are out of bounds (we start in left+1 and we end in right(cause substring excludes the end index))
        return s.substring(left+1 ,right);
    }
}