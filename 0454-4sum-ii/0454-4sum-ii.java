class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int n = nums1.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum = nums1[i] + nums2[j];
                map1.put(sum, map1.getOrDefault(sum, 0)+1);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum = nums3[i] + nums4[j];
                map2.put(sum, map2.getOrDefault(sum, 0)+1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> m : map1.entrySet()){
            int key = m.getKey();
            int value =m.getValue();

            if(map2.containsKey(-key)){
                count += (value*map2.get(-key));
            }
        }
        return count;
    }
}