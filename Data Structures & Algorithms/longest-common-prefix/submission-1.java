class Solution {
    public String longestCommonPrefix(String[] strs) {
      int n=strs.length;
      Arrays.sort(strs);
      String first=strs[0];
      String last=strs[n-1];
      String ans="";
      for(int i=0;i<first.length();i++){
        if(first.charAt(i)==last.charAt(i))  ans+=first.charAt(i);
        else break;
      }
      return ans;
      
        
        
        
    }
}