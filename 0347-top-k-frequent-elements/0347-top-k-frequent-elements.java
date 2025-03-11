import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a Min-Heap (PriorityQueue) to get top K frequent elements
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            Comparator.comparingInt(map::get)
        );

        for (int num : map.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Remove the least frequent element
            }
        }

        // Step 3: Convert Heap to array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }
}
