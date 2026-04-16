class Solution {
    public int singleNumber(int[] nums) {
        for(int j=0;j<nums.length;j++){
            int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]==nums[i]){
                count+=1;
            }
        }
         if(count % 3 != 0)
            return nums[j];
        }
    return nums[0];
    }
}