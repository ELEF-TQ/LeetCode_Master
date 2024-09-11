import java.util.HashMap;

class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) {
            return points.length;
        }
        
        int maxPointsOnLine = 1;
        
        // Iterate over every point as the reference point
        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> slopeMap = new HashMap<>();
            int duplicates = 0;
            int maxPointsForThisPoint = 0;
            
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                
                // Check for duplicate points
                if (dx == 0 && dy == 0) {
                    duplicates++;
                    continue;
                }
                
                // Reduce the slope to its simplest form by dividing by gcd
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;
                
                // Ensure consistent representation of slope (to avoid negative sign issues)
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                } else if (dx == 0) {
                    dy = Math.abs(dy); // Ensure vertical lines are treated consistently
                }
                
                // Store the slope as a string "dy/dx"
                String slope = dy + "/" + dx;
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                maxPointsForThisPoint = Math.max(maxPointsForThisPoint, slopeMap.get(slope));
            }
            
            // Add the number of duplicate points to the max count
            maxPointsOnLine = Math.max(maxPointsOnLine, maxPointsForThisPoint + duplicates + 1);
        }
        
        return maxPointsOnLine;
    }
    
    // Helper function to calculate gcd
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
