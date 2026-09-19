class Solution {
    public boolean isPalindrome(String s) {
        String sb=s.replaceAll("[^a-zA-Z0-9]", "");
        String check=sb.toLowerCase();
       // StringBuilder ncheck=new StringBuilder(check);
        int i=0,j=check.length()-1;
        while(i<j){
            if (check.charAt(i)!=check.charAt(j)){
                return false;
                
            }
           i++;
           j--;
        }
        return true;
        
        
    }
}