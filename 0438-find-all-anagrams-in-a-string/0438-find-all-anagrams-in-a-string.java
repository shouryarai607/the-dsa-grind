class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lis = new ArrayList<>();
        HashMap<Character, Integer>mapp= new HashMap<>();
        HashMap<Character, Integer>maps= new HashMap<>();

        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            mapp.put(ch, mapp.getOrDefault(ch, 0)+1);
        }

        int l=0;
        for(int r=0;r<s.length();r++){
            
            maps.put(s.charAt(r), maps.getOrDefault(s.charAt(r), 0)+1);
            
            if(r-l+1 == p.length()){

                if(mapp.equals(maps)){
                lis.add(l);
                }
                
                if(maps.get(s.charAt(l))==1){
                    maps.remove(s.charAt(l));
                }else{
                    maps.put(s.charAt(l), maps.get(s.charAt(l))-1);
                }
                l++;
            }

        }
        return lis;
    }
}