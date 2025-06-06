class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        // Trapping from left
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        // Trapping from right
        maxRight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return trappedWater;
    }
}
