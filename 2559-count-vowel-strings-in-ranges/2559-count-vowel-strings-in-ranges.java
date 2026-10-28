class Solution {

     public boolean isVowel(char ch){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return true;
            }else{
                return false;
            }
        }

    public int[] vowelStrings(String[] words, int[][] queries) {

        int q= queries.length;
        int n= words.length;
        int prefixsum[]=new int[n];
        int sum = 0;

        for(int i=0;i<n;i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))){
                sum++;
            }
            prefixsum[i]=sum;
        }
        int result[]=new int[q];

        for(int i=0;i<q;i++){
            int l=queries[i][0];
            int r=queries[i][1];

            int leftval = (l > 0) ? prefixsum[l-1] : 0;
            result[i] = prefixsum[r] - leftval;
        }
        return result;
    }
}