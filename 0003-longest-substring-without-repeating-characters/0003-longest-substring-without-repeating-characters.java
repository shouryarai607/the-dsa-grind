class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> set= new HashSet<>();

        // int l=0,r=0,lon=0,maxlong=0;

        // while(r<s.length()){
        //     if(set.isEmpty()){
        //         set.add(s.charAt(r));
        //         lon++;
        //         r++;
        //     }
        //     else if(set.contains(s.charAt(r))){
        //         set.remove(s.charAt(l));
        //         set.add(s.charAt(r));
        //         l++;r++;
        //     }
        //     else{
        //         set.add(s.charAt(r));
        //         r++;
        //         lon++;
        //     }
        //     maxlong=Math.max(maxlong, lon);
        // }
        // return maxlong;

        HashMap<Character, Integer>map=new HashMap<>();

        int l=0, maxlen=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l, map.get(ch)+1);
            }
            map.put(ch,r);
            maxlen=Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}