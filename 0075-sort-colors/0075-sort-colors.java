class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        int idx = 0;
        for (int color = 0; color < 3; color++) {
            int freq = count.getOrDefault(color, 0); 
            for (int j = 0; j < freq; j++) {
                nums[idx] = color;
                idx++;
            }
        }        
    }
}
