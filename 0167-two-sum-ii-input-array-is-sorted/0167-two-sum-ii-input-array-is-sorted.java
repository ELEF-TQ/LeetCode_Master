class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = numbers.length - 1 ;
        int right = 0 ;

        while(right < left){
            int sum = numbers[right] + numbers[left] ;
            if(sum > target) left-- ;
            else if(sum < target) right ++ ;
            else return new int[] {right + 1, left + 1};
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}