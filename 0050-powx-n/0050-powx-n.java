class Solution {
    public double myPow(double x, int n) {
        // Handle the case when n is Integer.MIN_VALUE
        long N = n;  // Use long to prevent overflow for n = Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;  // Convert n to positive
        }
        
        double result = 1;
        double currentProduct = x;
        
        // Use an iterative approach to calculate power
        while (N > 0) {
            if (N % 2 == 1) {
                result *= currentProduct;  // If N is odd, multiply result by currentProduct
            }
            currentProduct *= currentProduct;  // Square the base
            N /= 2;  // Reduce N by half
        }
        
        return result;
    }
}
