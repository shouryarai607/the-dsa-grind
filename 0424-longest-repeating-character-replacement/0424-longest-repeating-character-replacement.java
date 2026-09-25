class Solution {
    public int characterReplacement(String s, int k) {
        // HashMap<Character, Integer>map=new HashMap<>();

        // map.put(s.charAt(0), map.getOrDefault(s.charAt(0), 0)+1);

        // int len=0, maxlen=0, lim=k;
        // int l=0,r=1;
        // while(r<s.length()){
        //     if(map.containsKey(s.charAt(r))){
        //         map.put(s.charAt(r), map.get(s.charAt(r))+1);
        //         len++;
        //     }else if(lim!=0){
        //         len++;lim--;
        //     }else{
        //         if(map.containsKey(s.charAt(l))){
        //             if(map.get(s.charAt(l))==1){
        //                 map.remove(s.charAt(l));
        //             }else{
        //                 map.put(s.charAt(l), map.get(s.charAt(l))-1);
        //             }
        //             l++;
        //         }else{
        //           map.clear();
        //           map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)+1);
        //           r=l;
        //           lim=k;
        //           len=1;
        //         }
        //     }
        //     r++;
        //     maxlen=Math.max(maxlen, len);
        // }
        // return maxlen;

        int[] freq = new int[26];
        int l=0, maxfreq=0, maxlen=0;
        
        for(int r=0;r<s.length();r++){

            freq[s.charAt(r)-'A']++;

            maxfreq= Math.max(maxfreq, freq[s.charAt(r)-'A']);

            int windowlen= r-l+1;

            if(windowlen - maxfreq >k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            windowlen=r-l+1;
            maxlen= Math.max(maxlen , windowlen);
        }
        return maxlen;    
    }
}