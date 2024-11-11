class Solution {
    public boolean isPalindrome(int x) {
        // Handle edge case for 0, which is always a palindrome
        if (x == 0) {
            return true;
        }

        // Handle edge case for negative numbers
        if (x < 0) {
            return false;
        }

        StringBuilder rev = new StringBuilder();
        int num = x;

        // Reverse the digits of the number
        while (num != 0) {
            int rest = num % 10;
            rev.append(rest);
            num = num / 10;
        }

        // Compare the original number with the reversed string
        return Integer.toString(x).equals(rev.toString());
    }
}
