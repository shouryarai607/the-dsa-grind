class Solution {
    public int longestSubarray(int[] nums, int limit) {

        // int max=0;
        // int l=0, r=0;
        // while(r<nums.length){
        //     int check=Math.abs(nums[l]-nums[r]);
        //     if(check<=limit){
        //         max=Math.max(max, r-l+1);
        //         r++;
        //     }else{
        //         l++;
        //         r=l;
        //     }
        // }
        // return max;


        TreeMap<Integer, Integer> map=new TreeMap<>();
        // ye tree structure ka map jo key ko map ke under ascending order m arrange kr deta hai...

        int maxlen=0;

        int l=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);

            while(map.lastKey()-map.firstKey()>limit){
                map.put(nums[l],map.get(nums[l])-1);

                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            maxlen=Math.max(maxlen, r-l+1);
        }
        return maxlen;
        
    }
}