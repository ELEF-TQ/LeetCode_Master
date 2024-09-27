class Solution {
    public boolean checkValid(int[][] matrix) {

       int n = matrix.length ;

       for(int i=0 ; i < n ; i++){
          HashSet<Integer> rowSet = new HashSet<>();
          HashSet<Integer> colSet = new HashSet<>();

          for(int j=0 ; j < n ; j++){
            // valid row
            if(!rowSet.add(matrix[i][j]) || matrix[i][j] > n || matrix[i][j] < 1) return false ;

            // valid column
            if(!colSet.add(matrix[j][i]) || matrix[j][i] > n || matrix[j][i] < 1) return false ;

          }
       }

       return true ;
        
    }
}