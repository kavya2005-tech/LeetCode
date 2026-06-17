class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] s = new int[n];
        s[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            s[i] = Math.min(s[i+1],nums[i]);
        }
        int p = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
               p = Math.max(p,nums[j]);
            int ans = p-s[j];
            if(ans<=k){
                return j;
            }
            }
        
        return -1;
    }
}