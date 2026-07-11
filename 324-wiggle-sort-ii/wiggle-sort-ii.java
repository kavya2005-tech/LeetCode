class Solution {
    public void wiggleSort(int[] nums) {
         int n = nums.length;
         int[] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = nums[i];
         }
         Arrays.sort(arr);
         int small = (n-1)/2;
         int large = n-1;
          for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = arr[small--];
            } else {
                nums[i] = arr[large--];
            }
        }
        return;
    }
}