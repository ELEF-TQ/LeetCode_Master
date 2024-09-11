class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> nums_set = new HashSet<>() ;
        int max_sequence_length = 0 ;

        for(int num:nums){
            nums_set.add(num) ;
        }

        for(int i=0 ; i < nums.length ; i++){
            int current_num = nums[i] ;
            int current_sequence_length = 1 ; // first apperance counts

            if(!nums_set.contains(current_num - 1)){
                while(nums_set.contains(current_num + 1)){
                    current_num += 1 ;
                    current_sequence_length += 1 ;
                }
            }
            max_sequence_length = Math.max(max_sequence_length , current_sequence_length);
        }

        return max_sequence_length ;

        
    }
}