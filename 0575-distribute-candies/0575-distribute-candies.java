class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> candies = new HashSet<>();
        int n = candyType.length;
        int maxCandies = n / 2;

        for (int candy : candyType) {
            candies.add(candy);
            if (candies.size() == maxCandies) {
                break;
            }
        }

        return candies.size();
    }
}
