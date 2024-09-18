class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;     


        StringBuilder[] rows = new StringBuilder[numRows];
        // avoid initialisation with null
        for(int i= 0 ; i < numRows ; i++){
            rows[i] = new StringBuilder();
        }

        String direction = "DOWN";
        int currentRow = 0 ;

        for(char c : s.toCharArray()){
            rows[currentRow].append(c);

            if(currentRow == 0){
                direction = "DOWN";
            } else if(currentRow == numRows-1){
                direction="UP";
            }

            if(direction.equals("DOWN")) {
                currentRow++ ;
            } else if(direction.equals("UP")){
                currentRow-- ; 
            }
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);
        }

        return result.toString();





    }
}