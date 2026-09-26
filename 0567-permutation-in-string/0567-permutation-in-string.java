class Solution {
    public boolean checkInclusion(String s1, String s2) {
    //     HashMap<Character, Integer> map1= new HashMap<>();
    //     HashMap<Character, Integer> map2= new HashMap<>();

    //     // char fir=s1.charAt(0);
    //     for(int i=0;i<s1.length();i++){
    //         char ch = s1.charAt(i);
    //         map1.put(ch, map1.getOrDefault(ch, 0)+1);
    //     }

    //     int l=0;
    //     for(int r=0;r<s2.length();r++){
    //         map2.put(s2.charAt(r), map2.getOrDefault(s2.charAt(r), 0)+1);
    //     if(r-l+1 == s1.length()){
    //         if(map1.equals(map2)){
    //             return true;
    //         }
    //         if(map2.get(s2.charAt(l))==1){
    //         map2.remove(s2.charAt(l));
    //         }else{
    //             map2.put(s2.charAt(l), map2.get(s2.charAt(l))-1);
    //         }
    //         l++;
    //     }
    //     if(r==s2.length()-1){
    //         return false;
    //     }
    //     }
    
    //    return false;


    int[] sto=new int[26];

    for(int i=0;i<s1.length();i++){
        sto[s1.charAt(i)-'a']++;
    }

    int l=0;
    int count=s1.length();
    for(int r=0;r<s2.length();r++){

        if(sto[s2.charAt(r)-'a']>0){
            count--;
        }
        sto[s2.charAt(r)-'a']--;
        
        if(r-l+1>s1.length()){
            sto[s2.charAt(l)-'a']++;

            if(sto[s2.charAt(l)-'a']>0){
            count++;
        }
            l++;
        }
        
        if(count==0){
            return true;
        }
    }
    return false;

    }
}







