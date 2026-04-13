class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        int arr[] = new int[]{-1,-1};
        for(int start = 0;start< n;start++){
            if(target == nums[start]){
                arr[0] = start;
                break;
            }
            else{
                arr[0] = -1;
            }
        }
        for(int end = n-1;end>=0;end--){
          if(target==nums[end]){
            arr[1] = end;
            break;
          }else{
            arr[1] =-1;
          }
        }
        
        return arr;
    }
}