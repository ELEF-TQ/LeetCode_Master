class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        int[] res = new int[2];

        for (int num : nums) {
            if (seen[num]) {
                res[0] = num; // duplicate
            }
            seen[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                res[1] = i; // missing
                break;
            }
        }

        return res;
    }
}
