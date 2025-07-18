class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];  
        int[] minDist = new int[n];   
        int totalCost = 0;      

        // Initialize min distances to max
        minDist[0] = 0;
        for (int i = 1; i < n; i++) {
            minDist[i] = Integer.MAX_VALUE;
        }
       

        for (int i = 0; i < n; i++) {
            int u = -1;

            // Find the unvisited node with the smallest distance
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || minDist[j] < minDist[u])) {
                    u = j;
                }
            }

            // Add its cost and mark it as visited
            totalCost += minDist[u];
            visited[u] = true;

            // Update distances to unvisited neighbors
            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int dist = Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
                    if (dist < minDist[v]) {
                        minDist[v] = dist;
                    }
                }
            }
        }

        return totalCost;
    }
}
