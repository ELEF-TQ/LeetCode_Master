class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int candyCount = 1 ;
        int index = 0 ;

        while(candies > 0){
            index = index % num_people ;

            if(candies >= candyCount){
                result[index] += candyCount ;
                candies -= candyCount ;

                candyCount++ ;
                index++;
            }else {
                result[index] += candies;
                break ;
            }

        }

        return result ;
        
    }
}