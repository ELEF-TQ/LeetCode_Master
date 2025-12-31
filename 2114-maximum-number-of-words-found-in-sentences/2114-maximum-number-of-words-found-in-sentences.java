class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxNbr = 1 ;

        for(String sentence:sentences){
            String[] words = sentence.split(" ");
            int nbr = words.length;
            maxNbr = Math.max(nbr,maxNbr);
        }

        return maxNbr;
        
    }
}