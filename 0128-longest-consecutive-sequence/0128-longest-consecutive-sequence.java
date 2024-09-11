class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;  

        HashSet<Integer> nums_set = new HashSet<>() ;
        int max_sequence_length = 0 ;

        for(int num:nums){
            nums_set.add(num) ;
        }

        for(int num : nums_set){
           
            if(!nums_set.contains(num - 1)){
                int current_num = num ;
                int current_sequence_length = 1 ; // first apperance counts

                while(nums_set.contains(current_num + 1)){
                    current_num += 1 ;
                    current_sequence_length += 1 ;
                }
                
                max_sequence_length = Math.max(max_sequence_length , current_sequence_length);
            }
           
        }

        return max_sequence_length ;

        
    }
}