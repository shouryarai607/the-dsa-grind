class Solution {
    public void moveZeroes(int[] nums) {
    //     int j = -1;
    // for (int i = 0; i < nums.length; i++) {
    //   if (nums[i] == 0) {
    //     j = i;
    //     break;
    //   }
    // }
    // if (j == -1) {
    //     return;
    //   }
    // for (int i = j + 1; i < nums.length; i++) {
    //   if (nums[i] != 0) {
    //     nums[j] = nums[i];
    //     nums[i] = 0;
    //     j++;
    //   }
    // }

   int i=0, j=0;
   while (i<nums.length){
        if(nums[i]!=0){
        nums[j]=nums[i];
        j++;

        }
    i++;

   }
   while(j<nums.length){
    nums[j]=0;
    j++;
   }
   

    }
}