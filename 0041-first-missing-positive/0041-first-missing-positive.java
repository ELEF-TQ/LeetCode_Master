class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length ;

        // place each positive number in correct index
        for(int i=0 ; i < n ; i++){
            while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i] -1] ;
                nums[nums[i]-1] = nums[i] ; 
                nums[i] = temp ;
            }
        }

        // find first index where value is not i+1
        for(int i=0 ; i < n ; i++){
            if(nums[i] != i+1){
                return i+1 ;
            }
        }

        // if all numbers in correct place 
        return n+1 ;
        
    }
}