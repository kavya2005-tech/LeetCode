class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int result = 0;
        int l=0;
        int r=n-1;
        int leftMax = 0;
        int rightMax = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(leftMax <= height[l] ){
                    leftMax = height[l];
                }
                else{
                    result += leftMax-height[l];
                }
                l++;
            }
            else{
                if(rightMax <= height[r]){
                    rightMax = height[r];
                }
                else{
                    result += rightMax - height[r];
                }
                r--;
            }
        }
        return result;
    }
}