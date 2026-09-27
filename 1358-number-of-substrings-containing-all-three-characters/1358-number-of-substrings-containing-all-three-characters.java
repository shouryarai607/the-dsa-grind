class Solution {
    public int numberOfSubstrings(String s) {

        int[] arr=new int[26];
        int sub=0;

        int l=0;
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'a']++;

            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                sub++;
                sub =sub + (s.length()-1 - r);
                arr[s.charAt(l)-'a']--;
                l++;
                if(r-l+1<3){
                    break;
                }
            }

        }
        return sub;
        
    }
}