class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String result="";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            result+=first.charAt(i);
        }

        return result;
        
        
        
    }
}