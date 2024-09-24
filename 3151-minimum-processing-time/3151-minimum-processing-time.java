import java.util.*;

class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {

        Collections.sort(processorTime);  
        Collections.sort(tasks);         
        
        int maxTime = 0;
        int taskIndex = tasks.size() - 1; 
 
        for (int i = 0; i < processorTime.size(); i++) {
            int processorAvailableTime = processorTime.get(i);
            
            int currentMaxTaskTime = 0;
            for (int j = 0; j < 4; j++) {
                int taskTime = tasks.get(taskIndex);
                currentMaxTaskTime = Math.max(currentMaxTaskTime, processorAvailableTime + taskTime);
                taskIndex--; 
            }
            
            maxTime = Math.max(maxTime, currentMaxTaskTime);
        }
        
        return maxTime;
    }
}
