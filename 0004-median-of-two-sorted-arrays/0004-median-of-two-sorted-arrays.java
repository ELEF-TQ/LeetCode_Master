class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];
        
        int i = 0, j = 0, k = 0;
        
        // Merge nums1 and nums2 into merged array
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        // Add remaining elements from nums1
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        
        // Add remaining elements from nums2
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        
        // Calculate median
        if (totalLength % 2 == 0) {
            // If totalLength is even
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        } else {
            // If totalLength is odd
            return merged[totalLength / 2];
        }
    }
}
