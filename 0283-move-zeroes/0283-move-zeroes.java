class Solution {
    public void moveZeroes(int[] nums) {

         if (nums == null || nums.length == 0)  return; 

        int left = 0;  

        // move non 0's to the beginning
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
