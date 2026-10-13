class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlti=0, currAlti=0;
        for(int i=0;i<gain.length;i++){
            currAlti+=gain[i];
            maxAlti= Math.max(maxAlti, currAlti);
        }
        return maxAlti;
    }
}