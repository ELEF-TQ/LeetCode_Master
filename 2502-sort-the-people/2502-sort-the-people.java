import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] sortedNames = new String[n];
        HashMap<Integer, String> people = new HashMap<>();

        for (int i = 0; i < n; i++) {
            people.put(heights[i], names[i]);
        }

        // Convert heights to Integer[] for sorting
        Integer[] sortedHeights = new Integer[n];
        for (int i = 0; i < n; i++) {
            sortedHeights[i] = heights[i];
        }
        Arrays.sort(sortedHeights, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            sortedNames[i] = people.get(sortedHeights[i]);
        }

        return sortedNames;
    }
}
