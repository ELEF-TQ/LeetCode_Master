class Solution {
    public int jump(int[] nums) {
        // Edge case: if array has only one element, no jumps are needed
        if (nums.length == 1) return 0;

        int jumps = 0; // to count the number of jumps
        int current_end = 0; // the farthest we can go with the current jump
        int farthest = 0; // the farthest we can go overall

        // We don't need to check the last element because we're guaranteed to reach it
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest point we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we have reached the end of the range for the current jump
            if (i == current_end) {
                jumps++; // We need to make another jump
                current_end = farthest; // Update the range for the next jump

                // If current_end reaches or exceeds the last index, we can stop
                if (current_end >= nums.length - 1) break;
            }
        }

        return jumps;
    }
}
