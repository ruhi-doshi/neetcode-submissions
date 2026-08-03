class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        final=[]
        sample=[0,0]
        if(len(nums)==1):
            return sample
        for i in range(len(nums)):
            temp=nums[i]
            if nums[i+1::].count(target-temp)==0:
                continue
            else:
                final.append(i)
                final.append(nums.index(target-temp, i + 1))
                return final
        return final