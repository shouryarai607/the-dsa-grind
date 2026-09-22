class Solution {
    public int maxVowels(String s, int k) {
        int ans=0, i;
        for(i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                ans++;
            }
        }
        int maxv=ans;

        for(i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                ans--;
            }if(isVowel(s.charAt(i))){
                ans++;
            }
            maxv= Math.max(maxv, ans);
        }
        return maxv;

    
    }
     private boolean isVowel(char c){
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
        }
}