class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        
        

        for(int i=0;i<words.length;i++){
        if(words[i].length()>s.length()){
            continue;
            }
            int j=0;
            while(j<words[i].length() && words[i].charAt(j)==s.charAt(j) ){
                j++;
            } if(j==words[i].length()){
                    count++;
                }
        }return count;
    }
}