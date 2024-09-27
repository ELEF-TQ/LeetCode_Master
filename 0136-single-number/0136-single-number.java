class Solution {
    public int singleNumber(int[] nums) {

        int res = 0 ;
        for(int num:nums){
            res ^= num ; // XOR : all duplicates will be eliminated
        }
        return res ;
        
    }
}