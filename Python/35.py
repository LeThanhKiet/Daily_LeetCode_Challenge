class Solution():
     def searchInsert(self, nums, target):
          for i in range (0, len(nums)):
               if nums[i] == target:
                    return i;
               if nums[i] > target:
                    return i;
          return len(nums)


nums = [1, 3, 5, 6]
target = 5
print(Solution().searchInsert(nums, target))