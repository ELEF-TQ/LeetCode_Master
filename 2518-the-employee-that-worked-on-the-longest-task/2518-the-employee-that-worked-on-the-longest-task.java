class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int lastTime = 0;
        int maxTime = 0;
        int bestEmployeeId = -1;

        for (int[] log : logs) {
            int employeeId = log[0];
            int currentTime = log[1];
            int duration = currentTime - lastTime;

            if (duration > maxTime || (duration == maxTime && employeeId < bestEmployeeId)) {
                maxTime = duration;
                bestEmployeeId = employeeId;
            }

            lastTime = currentTime;
        }

        return bestEmployeeId;
    }
}
