public class Solution {
    public int[] frequencySort(int[] nums) {

        // Step 1: Count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert array to list
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        // Step 3: Sort with custom sorting logic without using compareTo
        numList.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return freqA - freqB; // ascending order
            } else {
                return b-a; // descending  order
            }
        });

        // Step 4: Convert list back to array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }

        return nums;
    }
}
