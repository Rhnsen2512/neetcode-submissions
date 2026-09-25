class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n=strs.length;
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] freq =new int[26];
            for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
            }
            StringBuilder sb=new StringBuilder(52);
            for(int f:freq){
                sb.append(f).append("#");
            }
            String key=sb.toString();
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}
