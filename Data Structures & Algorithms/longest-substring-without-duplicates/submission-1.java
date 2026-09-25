class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        char[] ch=s.toCharArray();
        int n=ch.length;
        int l=0;
        int max=0;
        int size=0;
        for(int r=0;r<n;r++){
           while(!set.add(ch[r])){
               set.remove(ch[l]);
               l++;
           }
            set.add(ch[r]);
            max=Math.max(set.size(),max);
            
           
           

        }
        return max;


        
    }
}
