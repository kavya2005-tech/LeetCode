class Solution(object):
    def minSubArrayLen(self, target, nums):
        
        left = 0
        min_len = float("inf")
        tot_sum = 0

        for right in range(len(nums)):

            tot_sum += nums[right]

            while tot_sum >= target:
                min_len = min(min_len, right - left + 1)
                tot_sum -= nums[left]
                left += 1

        return 0 if min_len == float("inf") else min_len


        