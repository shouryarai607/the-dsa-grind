class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0, sum1 = 0, total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            sum1 += nums[i];
            total += nums[i];
            max = Math.max(max, sum);
            min = Math.min(min, sum1);
            if(sum < 0){
                sum = 0;
            }
            if(sum1 > 0){
                sum1 = 0;
            }
        }
         if(max < 0){
                return max;
            }   
        return Math.max(max, total-min);
    }
}