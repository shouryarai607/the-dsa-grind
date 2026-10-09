class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }

        private int atMost(int[] nums, int k){

            HashMap<Integer, Integer>mpp= new HashMap<>();
            int l=0;
            int count=0;
            for(int r=0;r<nums.length;r++){
                mpp.put(nums[r], mpp.getOrDefault(nums[r], 0)+1);

                while(mpp.size()>k){
                //    int val = nums[l];
                    mpp.put(nums[l], mpp.get(nums[l])-1);

                    if(mpp.get(nums[l])==0){
                        mpp.remove(nums[l]);
                    }
                    l++;
                }
                count+= r-l+1;
            }
            return count;
        }
    
}