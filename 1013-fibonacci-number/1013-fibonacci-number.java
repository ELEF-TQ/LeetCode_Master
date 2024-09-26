class Solution {
    public int fib(int n) {

        if(n==0) return 0 ;
        if(n==1) return 1 ;
        int a=0 ;
        int b=1;
        for(int i=2 ; i <= n ; i++){
            int sum = a + b ;
            a = b ;
            b = sum ;
        }
        return b ;

       
        
    }
}



/*  recursion O(2^n) */
//  if(n==0) return 0 ;
//  if(n==1) return 1 ;
//  return fib(n-1) + fib(n-2); 