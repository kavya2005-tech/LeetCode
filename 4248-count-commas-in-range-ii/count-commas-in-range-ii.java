class Solution {
    public long countCommas(long n) {
        long count = 0;
        long s = 1000;
        long c = 1;
        while(s<=n){
            long end = s * 1000 -1;
            long cnt = Math.min(n,end)- s+1;
            count += cnt * c;
            s *= 1000;
            c++;
        }
        return count;
    }
}