class Solution {
    public int leastInterval(char[] tasks, int n) {
  
        int[] freq = new int[26];
        int maxFreq = 0;
        
        // maximum frequency
        for (char task : tasks) {
            freq[task - 'A']++;
            maxFreq = Math.max(maxFreq, freq[task - 'A']);
        }
        
        // tasks have maxFreq
        int count = 0;
        for (int f : freq) {
            if (f == maxFreq) count++;
        }
      
        return Math.max((maxFreq - 1) * (n + 1) + count, tasks.length);
    }
}