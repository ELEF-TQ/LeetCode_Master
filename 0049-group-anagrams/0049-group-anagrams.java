class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String , List<String>> map = new HashMap<>() ;

        for(String word:strs){

            // Sort the string
            char[] current = word.toCharArray() ; // string -> array
            Arrays.sort(current) ; // sort caracters
            String sortedString = new String(current) ; // array -> string

           
            if(!map.containsKey(sortedString)) {
                map.put(sortedString , new ArrayList<String>());
            }

            map.get(sortedString).add(word); // Add the original word to the list 

        }

         
        return new ArrayList<>(map.values()); 

        
    }
}