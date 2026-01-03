class Solution {
    public int numOfWays(int n) {
        long a =6;
        long b =6;
        long mod = 1_000_000_007;
        for(int i=1;i<n;i++){
            long a1 = (3*a + 2*b)%mod;
            long b1 = (2*a + 2*b)%mod;
            a = a1;
            b = b1;

        }
        return (int)((a+b)%mod);
    }
}