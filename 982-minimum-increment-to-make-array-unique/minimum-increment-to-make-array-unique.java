class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<=nums[i]){
                int val = nums[i]+1;
                count += (val - nums[i+1]);
                nums[i+1] = val;
            }
        }
        return count;
    }
}