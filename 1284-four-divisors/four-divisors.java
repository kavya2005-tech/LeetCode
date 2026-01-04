class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans =0;
        for(int n: nums){
            int sum = 0;
            int count = 0;
            for(int j=1;j*j<= n;j++){
                if(n%j == 0){
                    int i = n/j;
                    count++;
                    sum += j;
                    if( j != i){
                        count++;
                        sum += i;
                    }
                    if(count>4)break;
                }
            }

                if(count== 4){
                    ans += sum;
            }
        }
        return ans;
    }
}