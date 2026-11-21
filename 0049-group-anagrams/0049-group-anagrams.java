class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List> map = new HashMap<>();

        for(String s : strs){
            int[] arr = new int[26];

            for(int c : s.toCharArray()){
                arr[ c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : arr){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}