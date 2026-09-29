class Solution {
    public String minWindow(String s, String t) {
        int[] arr= new int[128];

        for(char c : t.toCharArray()){
            arr[c]++;
        }

        int l=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        int count =0;

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(arr[c]>0){
                count++;
            }
            arr[c]--;

            while(count == t.length()){
                if(r-l+1 < minlen){
                    minlen=r-l+1;
                    start=l;
                }
                char ch=s.charAt(l);
                arr[ch]++;

                if(arr[ch]>0){
                    count--;
                }
                l++;
            }
        }
        return minlen ==Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}