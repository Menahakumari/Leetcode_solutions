class Solution(object):
    def twoSum(self, nums, target):
        c_map={}
        for i,nums in enumerate(nums):
            if target-nums in c_map:
                return [c_map[target-nums],i]
            c_map[nums]=i

        