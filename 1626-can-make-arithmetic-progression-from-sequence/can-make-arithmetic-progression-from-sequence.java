class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if(n<=2) return true;
        int diff = arr[1] - arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1] != diff){
                return false;
            }
            continue;
        }
        return true;
    }

}