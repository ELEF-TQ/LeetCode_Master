import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
     
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        //  descending order
        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);

       
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }
}
