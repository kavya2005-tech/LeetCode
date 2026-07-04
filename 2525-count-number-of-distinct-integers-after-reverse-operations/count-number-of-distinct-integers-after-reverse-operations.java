class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int[] res = new int[2*n];
        for(int i=0;i<n;i++){
            res[i] = nums[i];
        }
        for(int i=n;i<2*n;i++){
               int num = nums[i-n];
               int rev = 0;
               while(num>0){
                int dig = num%10;
                rev =  rev*10+dig;
                num/=10;
               }
               res[i] = rev;
        }
        Arrays.sort(res);
        int count =1;
        for(int i=0;i<res.length-1;i++){
            if(res[i] != res[i+1]){
                count++;
            }
        }
        return count;
    }
}