import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        Arrays.sort(nums); // Sort the array to apply two-pointer technique
        
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Avoid duplicates for the first number
            
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Avoid duplicates for the second number
                
                int left = j + 1;
                int right = nums.length - 1;
                
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        while (left < right && nums[left] == nums[left + 1]) left++; // Avoid duplicates for the third number
                        while (left < right && nums[right] == nums[right - 1]) right--; // Avoid duplicates for the fourth number
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Move left pointer to increase the sum
                    } else {
                        right--; // Move right pointer to decrease the sum
                    }
                }
            }
        }
        
        return result;
    }
}
