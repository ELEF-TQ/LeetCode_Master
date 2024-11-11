class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0) {
            return false;
        }

        StringBuilder rev = new StringBuilder();
        int num = x;

      
        while (num != 0) {
            int rest = num % 10;
            rev.append(rest);
            num = num / 10;
        }


        return Integer.toString(x).equals(rev.toString());
    }
}
