class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        long total = 0;
        for(int i = 0;i<n;i++){
            total += nums[i];
        }
        long left = 0;
        for(int i=0;i<n-1;i++){
            left += nums[i];
            long right = total - left;
            if(left>=right){
                count++;
            }
            
        }
        return count;
    }
}