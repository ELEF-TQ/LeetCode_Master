import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }


        Set<Integer> uniqueCounts = new HashSet<>();
        for (int count : counts.values()) {
            if (!uniqueCounts.add(count)) {
                return false; 
            }
        }

        return true; 
    }
}
