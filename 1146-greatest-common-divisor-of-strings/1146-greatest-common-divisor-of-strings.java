class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Concatenation
        if (!(str1 + str2).equals(str2 + str1)) return "";
        
        int a = str1.length();
        int b = str2.length();

        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        // First a characters
        return str1.substring(0, a);
    }
}
