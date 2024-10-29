class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for(int i=1 ; i <= n/2 ; i++){
            if(n%i == 0){
                int num_repeats = n/i ;
                String substring = s.substring(0,i);
                StringBuilder sb = new StringBuilder();

                for(int j=0 ; j < num_repeats ; j++){
                    sb.append(substring);
                }

                if(sb.toString().equals(s)) return true ;


            }
        }

        return false ;
        
    }
}