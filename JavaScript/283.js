/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */

let moveZeroes = (nums) => {
  let curIndex = 0;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] != 0) {
      nums[curIndex] = nums[i];
      curIndex++;
    }
  }

  for (let i = curIndex; i < nums.length; i++) {
    nums[i] = 0;
  }
};
