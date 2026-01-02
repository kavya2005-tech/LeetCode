class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    n=nums[i];
                }
            }
        }
        return n;
    }
}