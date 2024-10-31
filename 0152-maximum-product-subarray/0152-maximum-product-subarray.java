class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            // Swap maxProd and minProd if the current number is negative
            if (num < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            
            // Calculate the maximum and minimum products up to the current element
            maxProd = Math.max(num, maxProd * num);
            minProd = Math.min(num, minProd * num);

            // Update the result with the maximum product found so far
            result = Math.max(result, maxProd);
        }

        return result;
    }
}
