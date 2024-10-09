/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    const hash = new Map();

    for(let i=0 ; i <nums.length ; i++){
        let rest = target - nums[i];

         if (hash.has(rest)) {
            return [hash.get(rest), i];
        } else {
            hash.set(nums[i], i);
        }
    }

    throw new Error("No solution")
    
};