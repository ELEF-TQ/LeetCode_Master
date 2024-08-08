class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0 ;

       for(int[] customer : accounts)  {
          int curentCustomerWealth =0;
          for(int bank: customer) {
            curentCustomerWealth += bank ;
          }
          maxWealthSoFar = Math.max(maxWealthSoFar ,curentCustomerWealth);
       }  

       return  maxWealthSoFar;
    }
}