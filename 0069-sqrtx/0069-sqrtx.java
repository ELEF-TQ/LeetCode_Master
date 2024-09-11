class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0; // The square root of 0 is 0
        }
        
        int left = 1, right = x;
        
        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid; // We found the exact square root
            } else if (mid < x / mid) {
                left = mid + 1; // Look for a larger square root
            } else {
                right = mid - 1; // Look for a smaller square root
            }
        }
        
        return right; // When the loop exits, right is the integer square root
    }
}
