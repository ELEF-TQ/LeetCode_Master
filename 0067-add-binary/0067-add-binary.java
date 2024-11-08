class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;

        while (aLength >= 0 || bLength >= 0 || carry != 0) {

            int bitA = (aLength >= 0) ? a.charAt(aLength) - '0' : 0;
            int bitB = (bLength >= 0) ? b.charAt(bLength) - '0' : 0;
            
            int sum = bitA + bitB + carry;
            result.append(sum % 2);
            carry = sum / 2;

            aLength--;
            bLength--;
        }

        return result.reverse().toString();
    }
}
