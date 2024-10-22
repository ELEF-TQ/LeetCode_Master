class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0 ;
        int current = 0 ;

        for(int altitude:gain){
            current += altitude ;
            highest = Math.max(current ,highest);

        }
        return highest ;
        
    }
}