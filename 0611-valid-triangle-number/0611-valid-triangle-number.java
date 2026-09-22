class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int l, r;
        for(int i=nums.length-1;i>=0;i--){
 
            l=0;
            r=i-1;
            
            while(l<r){
                if(nums[l]+nums[r]>nums[i]){
                    ans+=r-l;
                    r--;;
                }else{
                    l++;
                }
            }
        }
        return ans;
        
    }
}