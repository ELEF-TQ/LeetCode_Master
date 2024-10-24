import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];

  
        for (int num : nums) {
            seen[num - 1] = true; // 0-based index
        }

        for (int i = 0; i < seen.length; i++) {
            if (!seen[i]) {
                missing.add(i + 1); 
            }
        }

        return missing;
    }
}
