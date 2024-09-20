class Solution {
    public String largestPalindromic(String num) {

        HashMap<Character,Integer> counts = new HashMap<>();

        for(char c:num.toCharArray()){
            counts.put(c , counts.getOrDefault(c,0)+1);
        }

        StringBuilder palindrome = new StringBuilder();
        char middle = 0 ;

        for(char digit='9' ; digit >= '0' ; digit--){
            int count = counts.getOrDefault(digit,0);
            if(count > 0){
                for(int i=0 ; i < count/2 ;i++){
                    palindrome.append(digit);
                }

                if(count%2 == 1 && middle==0){
                    middle = digit ;
                }
            }
        }

        // leading zeros
        if (palindrome.length() == 0 || palindrome.charAt(0) == '0') {
            return middle == 0 ? "0" : String.valueOf(middle);
        }

        String firstHalf = palindrome.toString();  
        String secondHalf = new StringBuilder(firstHalf).reverse().toString(); // StringBuilder has a built in reverse

        return firstHalf + (middle != 0 ? middle : "") + secondHalf;


        
    }
}