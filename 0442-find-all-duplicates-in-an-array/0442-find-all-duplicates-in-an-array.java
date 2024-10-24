class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> dup = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int num:nums){
            if(!dup.add(num)) duplicates.add(num);
        }

        return duplicates;
        
    }
}