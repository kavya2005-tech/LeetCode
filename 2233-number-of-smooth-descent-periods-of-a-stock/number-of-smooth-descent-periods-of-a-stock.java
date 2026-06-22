class Solution {
    public long getDescentPeriods(int[] prices) {
        long n = prices.length;
        long ans = 1;
        long max = 1;
        for(int i = 1;i<n;i++){
            if(prices[i] == prices[i-1]-1){
                max++;
            }
            else{
                max = 1;
            }
            ans += max;
        }
        return ans;
    }
}