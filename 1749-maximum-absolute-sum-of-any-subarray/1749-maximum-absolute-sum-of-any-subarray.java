class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0, sum1 = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            sum1 += nums[i];
            max = Math.max(max, sum);
            min = Math.min(min, sum1);
            if(sum < 0){
                sum = 0;
            }
            if(sum1 > 0){
                sum1 = 0;
            }
        }
        max = Math.max(max, Math.abs(min));
        return max;
    }
}