class Solution(object):
    def centeredSubarrays(self, nums):

        res = 0

        for i in range(len(nums)):
            sub_sum = 0
            nums_set = set()
            for j in range(i, len(nums)):
                sub_sum += nums[j]
                nums_set.add(nums[j])

                res += int(sub_sum in nums_set) 

        return res 