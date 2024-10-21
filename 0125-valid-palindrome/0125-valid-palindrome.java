class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sentence = new StringBuilder();

        // string to array
        for(Character c:s.toCharArray()){
            if(Character.isLetterOrDigit(c) ){
                sentence.append(Character.toLowerCase(c));
            }
        }

        // Check Pilandrome
        int left = 0 ;
        int right = sentence.length() - 1 ;
        
        while(left < right){
            if(sentence.charAt(left) != sentence.charAt(right)){
                return false ;
            }
            left++ ;
            right--;
        }

        return true ;
 
    }
}
