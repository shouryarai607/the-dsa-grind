class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    //     return atMost(nums,goal) - atMost(nums, goal-1);
        
    // }
    // public int atMost(int[] nums, int goal){
    //     if(goal<0){
    //         return 0;
    //     }
    //     int l=0, r=0, sum=0, count=0;
    //     while(r<nums.length){
    //         sum+=nums[r];
    //         while(sum>goal){
    //             sum= sum-nums[l];
    //             l=l+1;
    //         }
    //         count=count+ (r-l+1);
    //         r=r+1;
    //     }
    //     return count;

    HashMap<Integer, Integer>map = new HashMap<>();

    map.put(0, 1);

    int sum = 0;
    int count = 0;

    for(int i=0;i<nums.length;i++){
        sum += nums[i];

        count += map.getOrDefault(sum-goal, 0);

        map.put(sum , map.getOrDefault(sum, 0)+1);
    }
    return count;
    }
}