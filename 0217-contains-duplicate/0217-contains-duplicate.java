class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false; 

        Set<Integer> set = new HashSet<>(nums.length); // Pre-allocate capacity

        for (int num : nums) {
            if (!set.add(num)) return true; 
        }

        return false;
    }
}
