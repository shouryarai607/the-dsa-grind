class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum=0;
        for(int num: nums){
            sum = (sum + num) % p;
        }
        int target = sum % p;
        if(target == 0){
            return 0;
        }

        int result = nums.length;
        int curr = 0;
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            curr = (curr + nums[i]) % p;

            int rem = (curr - target + p) % p;
            if(map.containsKey(rem)){
                result= Math.min(result, i - map.get(rem));
            }
            map.put(curr, i);
        }
        return result == nums.length ? -1 : result;
    }
}