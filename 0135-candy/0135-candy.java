class Solution {
    public int candy(int[] ratings) {
        
        int n = ratings.length;
        int[] candies = new int[n];
        
        // Chaque enfant reçoit au moins 1 bonbon
        Arrays.fill(candies, 1);

        // Parcours de gauche à droite
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Parcours de droite à gauche
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calcul du total
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
