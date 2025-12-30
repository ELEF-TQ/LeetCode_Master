class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        String str = String.valueOf(n);

        for (char c : str.toCharArray()) {
            int digit = c - '0';   // char → digit
            sum += digit;
            pro *= digit;
        }

        return pro - sum;
    }
}
