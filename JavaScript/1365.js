/**
 * @param {number[]} nums
 * @return {number[]}
 */
let smallerNumbersThanCurrent = function (nums) {
  let arr = [];
  for (let i = 0; i < nums.length; i++) {
    let cnt = 0;
    for (let j = 0; j < nums.length; j++) {
      if (nums[j] < nums[i]) {
        cnt++;
      }
    }
    arr.push(cnt);
  }

  return arr;
};
