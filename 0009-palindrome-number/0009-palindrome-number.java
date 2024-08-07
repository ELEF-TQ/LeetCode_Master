class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversed_int = 0;

        while (x > reversed_int) {
            int digit = x % 10;
            reversed_int = reversed_int * 10 + digit;
            x /= 10;
        }

       
        return x == reversed_int || x == reversed_int / 10;
    }
}
