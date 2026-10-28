class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n=nums.length;
        int count=0;
        int prefixsum=0;

        // int prefix[]= new int[n];
        // prefix[0]=nums[0];
        // for(int i=1;i<n;i++){
        //     prefix[i]=prefix[i-1]+nums[i];
        // }

        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<nums.length;i++){
           prefixsum += nums[i];

           int val = prefixsum - k;

           if(map.containsKey(val)){
            count += map.get(val);
           }

           map.put(prefixsum, map.getOrDefault(prefixsum, 0)+1);
        }
        return count;
    }
}