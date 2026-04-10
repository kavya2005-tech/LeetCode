class Solution {
    public int findFinalValue(int[] nums, int original) {
        int val = original;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           if(nums[i]==val){
            val = 2*nums[i];
           }
        }
        return val;
    }
}