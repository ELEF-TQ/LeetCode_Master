class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length ;
        int countPos = 0 ;
        int countNeg = 0 ;

        for(int i=0 ; i<n ; i++){
            if(nums[i] < 0) countNeg++;
            else if(nums[i] > 0) countPos++;
        }

        return Math.max(countNeg,countPos);
        
    }
} 