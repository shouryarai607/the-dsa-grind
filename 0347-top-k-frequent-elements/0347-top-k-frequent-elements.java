class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>();
        List <Integer>[] arr = new ArrayList[nums.length +1];

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int n : map.keySet()){
            if(arr[map.get(n)] == null){
                arr[map.get(n)] = new ArrayList<>();
            }
            arr[map.get(n)].add(n);
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i= arr.length -1;i>0;i--){
            if(arr[i] != null){
                for(int n : arr[i]){
                    ans[index++] = n;

                    if(index == k){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}