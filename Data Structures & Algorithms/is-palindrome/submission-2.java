class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^a-zA-Z0-9]","").trim().replaceAll("\\s","").toLowerCase();
        int n=s1.length();
        int low=0;
        int high=n-1;
        while(low<high){
            if(s1.charAt(low)!=s1.charAt(high)){
                return false;

            }
            low++;
            high--;
        }
        return true;
    
        
    }
}
