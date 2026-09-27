class Solution {
    public int longestSubarray(int[] nums) {
        int del=1, out=0, maxout=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            
            if(nums[r]==1){
                out++;
            }
            while(nums[r]!=1 && del==0){
                if(nums[l]!=1){
                    del++;l++;
                }else{
                l++;
                out--;
                }
            }
            if(nums[r]!=1 && del==1){
                
                del--;
            }
            maxout=Math.max(maxout, out);
            if(r==nums.length-1 && del==1){
               maxout--;
            }
        }
        return maxout;   
    }
}