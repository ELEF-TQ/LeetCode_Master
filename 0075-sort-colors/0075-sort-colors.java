class Solution {
    public void sortColors(int[] nums) {
        int low = 0, i = 0, high = nums.length - 1;

        while (i <= high) {
            if (nums[i] == 0) {
                // Swap current element with `low` pointer, then increment `low` and `i`
                swap(nums, i, low);
                low++;
                i++;
            } else if (nums[i] == 2) {
                // Swap current element with `high` pointer, then decrement `high`
                swap(nums, i, high);
                high--;
            } else {
                // If the element is 1, just move to the next element
                i++;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
