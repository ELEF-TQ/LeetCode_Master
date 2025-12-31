class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int minDist = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < points.length; i++) {
            int xi = points[i][0];
            int yi = points[i][1];

            if (x == xi || y == yi) {
                int dist = Math.abs(x - xi) + Math.abs(y - yi);

                if (dist < minDist) {
                    minDist = dist;
                    index = i;
                }
            }
        }

        return index;
    }
}
