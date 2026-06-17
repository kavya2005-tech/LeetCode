class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] arr = new int[n];
        long rev =0;
        for(int i=0;i<n;i++){
            int dig = word.charAt(i) - '0';
            rev = (rev * 10 + dig) % (long)m;
            if (rev == 0) {
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
           
        }
        return arr;
    }
}