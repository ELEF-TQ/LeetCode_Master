import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0 ; i < nums.length ; i++){
            int diff = target - nums[i];

            if (hash.containsKey(diff)) {
                return new int[] {hash.get(diff), i};
            }

            hash.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution");


        
    }
}
