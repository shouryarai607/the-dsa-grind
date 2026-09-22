class Solution {
    public int maxVowels(String s, int k) {
        int ans=0, i;
        for(i=0;i<k;i++){
            if(s.charAt(i)=='a' || 
            s.charAt(i)=='e' || 
            s.charAt(i)=='i' ||
            s.charAt(i)=='o' || 
            s.charAt(i)=='u'){
                ans++;
            }
        }
        int maxv=ans;

        for(i=k;i<s.length();i++){
            if(s.charAt(i-k)=='a' || 
            s.charAt(i-k)=='e' ||
            s.charAt(i-k)=='i' || 
            s.charAt(i-k)=='o' || 
            s.charAt(i-k)=='u'){
                ans--;
            }if(s.charAt(i)=='a' || 
            s.charAt(i)=='e' || 
            s.charAt(i)=='i' ||
            s.charAt(i)=='o' || 
            s.charAt(i)=='u'){
                ans++;
            }
            maxv= Math.max(maxv, ans);
        }
        return maxv;
    
    }
}