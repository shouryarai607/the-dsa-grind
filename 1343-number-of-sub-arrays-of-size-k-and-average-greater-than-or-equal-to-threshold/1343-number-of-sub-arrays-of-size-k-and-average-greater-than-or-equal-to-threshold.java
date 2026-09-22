class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i;
        int sum=0;
        int ans=0;

        for(i=0;i<k;i++){
            sum = sum+arr[i];
        }
        if(threshold<=sum/k){
            ans++;
        }
        for(i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(threshold<=sum/k){
            ans++;
        }
        }
        return ans;
    }
}