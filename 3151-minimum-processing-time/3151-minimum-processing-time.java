import java.util.*;

class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);  
        Collections.sort(tasks, Collections.reverseOrder());

        int maxTime = 0;

        for (int i = 0, j = 0; i < processorTime.size() && j + 3 < tasks.size(); i++, j += 4) {
            
            int processorAvailableTime = processorTime.get(i);
            int currentMaxTaskTime = processorAvailableTime + tasks.get(j);

            maxTime = Math.max(maxTime, currentMaxTaskTime);
        }

        return maxTime;
    }
}
