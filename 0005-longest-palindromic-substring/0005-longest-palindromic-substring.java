class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        String maxStr = "";
        
      for(int i=0 ; i < s.length() ; i++){
        for(int j=0 ; j <= 1 ; j++){
            int left = i , right = i+j ;


            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left-- ;
                right++ ;
            }

            if(right-left-1 > maxStr.length()){
                maxStr = s.substring(left+1,right);
            }
        }
      }
        
        return maxStr;
    }
}
