class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        while(i<j){
           
                if(numbers[i]+numbers[j] == target){
                    i=i+1;j=j+1;
                    return new int[]{i, j};
                }
                if(numbers[i]+numbers[j] < target){
                    i++;
                }
                if(numbers[i]+numbers[j] > target){
                    j--;
                }
            
            
            
        }
       return new int[]{};
        
    }
}