class Solution {
    public int maxProduct(int[] nums) {
        int max =nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            int pro = nums[i];

            if(pro < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(pro, max * pro);
            min = Math.min(pro, min * pro);

            result = Math.max(result, max);
        }
        return result;
    }
}