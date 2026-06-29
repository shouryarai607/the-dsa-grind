class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mpp=new HashMap<>();
      int k=2, l=0, r=0, maxLen=0;

      while(r<fruits.length){
        mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0)+ 1);
        while (mpp.size()>k){
            mpp.put(fruits[l], mpp.get(fruits[l])-1);
        
        if (mpp.get(fruits[l])==0){
            mpp.remove(fruits[l]);
        }
            l++;
        }
            maxLen= Math.max(maxLen, r-l+1);
            r++;
        
      }

        return maxLen;
        
    }
}