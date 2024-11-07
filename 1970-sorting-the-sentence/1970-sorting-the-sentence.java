class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] res = new String[words.length];


        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '0';
            res[index - 1] = word.substring(0, word.length() - 1); 
        }

    
        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            sorted.append(res[i]);
            if (i != res.length - 1) {
                sorted.append(" "); 
            }
        }

        return sorted.toString();
    }
}
