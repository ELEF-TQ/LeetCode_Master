class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 
        
        int left = 0;
        
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right]; 
            }
        }
        
        return left + 1; // number of unique values
    }
}
