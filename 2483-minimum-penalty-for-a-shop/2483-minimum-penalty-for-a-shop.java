class Solution {
    public int bestClosingTime(String customers) {

        // int suffix = 0;
        // for(int i=n-1;i>=0;i--){
        //     if(customers.charAt(i)=='Y'){
        //         suffix++;
        //     }
        // }

        int n=customers.length();
        int penalty = 0;

        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='Y'){
                penalty++;
            }
        }
        int minpenalty = penalty;
        int besthrs = 0;

        for(int i=1;i<=n;i++){
            if(customers.charAt(i-1)=='Y'){
                penalty--;
            }else{
                penalty++;
            }
            if(penalty<minpenalty){
                minpenalty = penalty;
                besthrs=i;
            }
        }
        return besthrs;
    }
}