class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        
        // Keep dividing n by 5 to count how many multiples of 5, 25, 125, ... , are in n
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        
        return count;
    }
}
