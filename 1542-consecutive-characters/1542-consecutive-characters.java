class Solution {
    public int maxPower(String s) {

        int currentCount = 1;
        int maxCount = 1;
        for(int i=0 ; i < s.length()-1 ; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                currentCount++ ;
                maxCount = Math.max(currentCount , maxCount);
            }else {
                currentCount = 1 ;
            }

        }

        return maxCount ;
    }
}