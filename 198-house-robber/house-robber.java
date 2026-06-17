class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return 0;
        int sum1=0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
          int max = Math.max(sum1,sum2+nums[i]);
          sum2 = sum1;
          sum1 = max;
        }
        return sum1;
    }
}