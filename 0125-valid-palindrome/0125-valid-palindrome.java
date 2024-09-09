class Solution {
    public boolean isPalindrome(String s) {
 
        StringBuilder sentence = new StringBuilder();

        // Removing non-alphanumeric characters
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                sentence.append(Character.toLowerCase(c)); 
            }
        }

        // Palindrome check with two pointers
        int aPointer = 0;
        int bPointer = sentence.length() - 1;

        while (aPointer <= bPointer) {
            if (sentence.charAt(aPointer) != sentence.charAt(bPointer)) {
                return false;
            }
            aPointer++;
            bPointer--;
        }

        return true;
    }
}
