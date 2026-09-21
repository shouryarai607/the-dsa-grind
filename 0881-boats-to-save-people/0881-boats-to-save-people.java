class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left=0, right=people.length-1, boat=0;
        Arrays.sort(people);

        while(left<=right){
          if(people[right]==limit){
            boat++;right--;
          }else if(people[left]+people[right]<=limit){
            left++;right--;boat++;
          }else{
            right--;boat++;
          }
        }
        return boat;
        
    }
}