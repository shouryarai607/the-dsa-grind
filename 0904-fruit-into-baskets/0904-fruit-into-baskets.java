class Solution {
    public int totalFruit(int[] fruits) {
    //     HashMap<Integer, Integer> mpp=new HashMap<>();
    //   int k=2, l=0, r=0, maxLen=0;

    //   while(r<fruits.length){
    //     mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0)+ 1);
    //     while (mpp.size()>k){
    //         mpp.put(fruits[l], mpp.get(fruits[l])-1);
        
    //     if (mpp.get(fruits[l])==0){
    //         mpp.remove(fruits[l]);
    //     }
    //         l++;
    //     }
    //         maxLen= Math.max(maxLen, r-l+1);
    //         r++;
        
    //   }

    //     return maxLen;




    // need hashmap because want to store frequency of duplicate fruit
    // HashSet<Integer> set= new HashSet <>();

    // int l=0, r=0, sum=0, maxsum=0;
    // int limit=2;

    // while(r<fruits.length){
    //     if(limit != 0){
    //         if(set.contains(fruits[r])){
    //             sum++;
    //             r++;
    //         }else{
    //         set.add(fruits[r]);
    //         sum++;limit--;
    //         r++;
    //         }
    //     }
    //     else if(limit==0){
    //         if(set.contains(fruits[r])){
    //             sum++;
    //             r++;
    //         }else{
    //         set.remove(fruits[l]);
    //         set.add(fruits[r]);
    //         l++;r++;
    //         }
    //     }
    //     maxsum=Math.max(maxsum, sum);
    // }
    // return maxsum;

    int fruit1=-1,fruit2=-1;
    int max=0;
    int count1=0, count2=0;

    int l=0;
    for(int r=0;r<fruits.length;r++){

        if(fruits[r]==fruit1){
            count1++;
        }else if(fruits[r]==fruit2){
            count2++;
        }
        else{
            while(count1>0 && count2>0){
                if(fruits[l]==fruit1){
                    count1--;
                }else{
                    count2--;
                }
                l++;
            }

            if(count1==0){
            fruit1= fruits[r];
            count1++;
        }else{
            fruit2=fruits[r];
            count2++;
        }
        }


        
        max= Math.max(max, r-l+1);
    }
    return max;

    }
}





