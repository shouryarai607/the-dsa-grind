class Solution {
    public int[] sortedSquares(int[] nums) {
        // for (int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);

        // return nums;
        

        int left=0,right=nums.length-1;
        int ans=nums.length-1;
        int[] result=new int[nums.length];
        while(left<=right){
          int leftval=  Math.abs(nums[left]);
            int rightval = Math.abs(nums[right]);
            if(rightval>leftval){
                result[ans]=rightval * rightval;
                right--;
            }
            else{
                result[ans]=leftval*leftval;
                left++;
            }
            ans--;
          
            
        }
        return result;
    }
}