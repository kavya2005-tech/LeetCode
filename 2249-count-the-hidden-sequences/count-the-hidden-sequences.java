class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long max = 0;
        long min = 0;
        long sum = 0;
        for(int i = 0;i<differences.length;i++){
            sum += differences[i];
            max = Math.max(sum,max);
            min = Math.min(sum,min);
        }
        long ans = max - min;
        long res = (long)(upper-lower)-ans+1;
        if(res < 0){
            return 0;
        }
        return (int)res;
    }
}