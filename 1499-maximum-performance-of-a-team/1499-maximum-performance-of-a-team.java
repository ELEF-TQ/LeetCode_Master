import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int MOD = 1_000_000_007;

        // Step 1: Create an array of engineers with their speed and efficiency
        int[][] engineers = new int[n][2];
        for (int i = 0; i < n; i++) {
            engineers[i][0] = efficiency[i];
            engineers[i][1] = speed[i];
        }

        // Step 2: Sort engineers by efficiency in descending order
        Arrays.sort(engineers, (a, b) -> b[0] - a[0]);

        // Step 3: Use a min-heap to track the top k speeds
        PriorityQueue<Integer> speedHeap = new PriorityQueue<>(k);
        long speedSum = 0;
        long maxPerformance = 0;

        // Step 4: Iterate through the engineers
        for (int[] engineer : engineers) {
            int currEfficiency = engineer[0];
            int currSpeed = engineer[1];

            // Add the current speed to the heap and speed sum
            speedHeap.add(currSpeed);
            speedSum += currSpeed;

            // If we exceed k engineers, remove the smallest speed
            if (speedHeap.size() > k) {
                speedSum -= speedHeap.poll();
            }

            // Calculate the performance with the current engineer as the minimum efficiency
            maxPerformance = Math.max(maxPerformance, speedSum * currEfficiency);
        }

        // Return the result modulo 10^9 + 7
        return (int) (maxPerformance % MOD);
    }
}
