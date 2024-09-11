class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            // if the current digit is less than 9, increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // if the current digit is 9, set it to 0
            digits[i] = 0;
        }

        // if all digits were 9, we need a new array with one more element
        digits = new int[digits.length + 1];
        digits[0] = 1;  
        return digits;
    }
}
