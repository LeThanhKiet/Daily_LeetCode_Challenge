/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

let twoSum = (nums, target) => {
  for (let i = 0; i < nums.length - 1; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] == target) return [i, j];
    }
  }
};
