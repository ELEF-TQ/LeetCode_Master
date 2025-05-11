import java.util.HashSet;

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();

            for (int j = 0; j < n; j++) {
                int rowVal = matrix[i][j];
                int colVal = matrix[j][i];

                // if the value is outside the limit or already exists in set -> return false
                if (rowVal < 1 || rowVal > n || !rowSet.add(rowVal)) return false;
                if (colVal < 1 || colVal > n || !colSet.add(colVal)) return false;
            }
        }

        return true;
    }
}
