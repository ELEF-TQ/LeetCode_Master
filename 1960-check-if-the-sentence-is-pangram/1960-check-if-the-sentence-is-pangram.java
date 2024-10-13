class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>();

        for(char c:sentence.toCharArray()){
           if(Character.isLetter(c)) letters.add(c);
        } 
        if(letters.size() == 26) return true;
        else return false ;
        
    }
}