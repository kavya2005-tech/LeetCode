class Solution {
    public boolean uniformArray(int[] nums1) {
       boolean even = true;
       int max = Integer.MAX_VALUE;
       for(int i=0;i<nums1.length;i++){
        if(nums1[i] % 2 != 0){
               even = false;
        }
        if(nums1[i] < max){
          max = nums1[i];
        }
       }
       return even || (max % 2 != 0);
    }
}