class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

         
        String prefix = strs[0];

        
        for (int i = 1 ; i < strs.length ; i++) {
            while (strs[i].indexOf(prefix) != 0) { // if the prefix is not at the begining
                prefix = prefix.substring(0, prefix.length() - 1); //remove the last caracter
              
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
        
    }
}