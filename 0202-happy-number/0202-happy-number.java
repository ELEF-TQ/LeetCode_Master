import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hash = new HashSet<>();
        int number = n;

        while (number != 1) {
            if (hash.contains(number)) {
                return false;
            }
            hash.add(number);
            number = SumOfSquares(number);
        }
        return true;
    }

    public int SumOfSquares(int number) {
        int output = 0;
        while (number != 0) {
            int digit = number % 10;
            output += digit * digit;
            number /= 10;
        }
        return output;
    }
}
