class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int left = 0 ;
        int right = nums.length - 1 ;
        int operations = 0 ;

        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k){
                operations++;
                left++;
                right--;
            }else if(sum < k){
                left++;
            }else if(sum > k){
                right--;
            }
        }

        return operations ;

        
        
    }
}