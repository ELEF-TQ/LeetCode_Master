class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0 ;
        int total = 0 ;
        int size = Integer.MAX_VALUE ;


       for(int right = 0 ; right < nums.length ; right++){
         total += nums[right];
         while(total >= target) {
            size = Math.min(right - left + 1 , size);
            total -= nums[left];
            left++;
         } 
       }
       
        
       if (size == Integer.MAX_VALUE )
         return 0 ;
       else 
         return size ;
       
    }
}