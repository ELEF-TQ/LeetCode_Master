class Solution {
    public int addDigits(int num) {

        if(num == 0) return 0;
        

        int res = num ;
        while(res/10 != 0){
            int num1 = res%10 ;
            int num2 = res/10 ;
            res = num1 + num2 ;
            
        }

        return res ;
        
    }
}