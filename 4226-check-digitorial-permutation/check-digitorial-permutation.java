class Solution {
    public boolean isDigitorialPermutation(int n) {
        if(n<=0){
            return false;
        }
       int temp = n;
       int sum = 0;
       while(temp>0){
        int dig = temp%10;
          int p = 1;
        for(int i=1;i<=dig;i++){
            p *= i;
        }
         sum+=p;
        temp /= 10;
       } 
       char[] s1 = String.valueOf(n).toCharArray();
       char[] s2 = String.valueOf(sum).toCharArray();
       
       Arrays.sort(s1);
       Arrays.sort(s2);
       
       return Arrays.equals(s1, s2);
    }
}