class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, maxsum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         sum = sum + nums[j];
        //         if(sum>maxsum){
        //             maxsum=sum;
        //         }
        //     }
        //     sum=0;
        // }
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            maxsum = Math.max(maxsum, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}