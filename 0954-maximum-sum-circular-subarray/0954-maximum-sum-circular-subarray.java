class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int curMax=0;
        int curMin=0;
        int totalSum = 0;

        for(int num : nums){
            totalSum+=num;
            
            // Max using Kadan's
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);

            // Min using kadan's
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);

            
        }
        return maxSum > 0 ? Math.max(maxSum, totalSum-minSum) : maxSum ;
    }
}