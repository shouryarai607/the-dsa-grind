class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int ans=1;

        for(int i=0;i<sentence.length()-1;i++){
            if(i==0 || sentence.charAt(i-1)==' '){
                int j=0;
                while(j<searchWord.length() && i+j<sentence.length() && sentence.charAt(i+j)==searchWord.charAt(j)){
                    j++;
                }
           if(j== searchWord.length()){
            return ans;
           }
           ans++;
        }
        }

        return -1;
    }
}